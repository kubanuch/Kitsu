package com.example.kitsu.presentation.ui.fragment.main.detail

import com.example.kitsu.base.BaseViewModel
import com.example.kitsu.domain.usecases.AnimeIdUseCase
import com.example.kitsu.domain.usecases.GenresUseCase
import com.example.kitsu.domain.usecases.MangaIdUseCase
import com.example.kitsu.presentation.models.detailmodels.DetailAnimeResponseUi
import com.example.kitsu.presentation.models.detailmodels.DetailMangaResponseUi
import com.example.kitsu.presentation.models.detailmodels.toUi
import com.example.kitsu.presentation.models.genresmodels.GenresListUi
import com.example.kitsu.presentation.models.genresmodels.toUi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class KitsuDetailViewModel @Inject constructor(
    private val useCaseAnime: AnimeIdUseCase,
    private val useCaseManga: MangaIdUseCase,
    private val useCaseGenres: GenresUseCase,
) : BaseViewModel() {

    private val _detailState = mutableUIStateFlow<DetailAnimeResponseUi>()
    val detailState = _detailState.asStateFlow()

    private val _detailStateManga = mutableUIStateFlow<DetailMangaResponseUi>()
    val detailStateManga = _detailStateManga.asStateFlow()

    private val _detailStateGenres = mutableUIStateFlow<GenresListUi>()
    val detailStateGenres = _detailStateGenres.asStateFlow()


    fun fetchAnimeId(id: String) =
        useCaseAnime.invoke(id).collectRequest(_detailState) {
            it.toUi()

        }

    fun fetchMangaId(id: String) {
        useCaseManga.invoke(id).collectRequest(_detailStateManga) {
            it.toUi()
        }
    }

    fun fetchGenres(id: String) =
        useCaseGenres.invoke(id).collectRequest(_detailStateGenres) { it.toUi() }
}

