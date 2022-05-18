package com.example.kitsu.presentation.ui.fragment.main.manga

import androidx.paging.map
import com.example.kitsu.base.BaseViewModel
import com.example.kitsu.data.repositories.MangaRepositoryImpl
import com.example.kitsu.presentation.models.mangamodels.toUi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class MangaViewModel @Inject constructor(private val repositoryImpl: MangaRepositoryImpl) :
    BaseViewModel() {


    fun fetchPopularManga(manga: String) =
        repositoryImpl.fetchManga(manga).map { pagingData ->
            pagingData.map { manga ->
                manga.toUi()

            }
        }

    fun fetchRatingManga(param: String) =
        repositoryImpl.fetchManga(param).map {
            it.map { manga ->
                manga.toUi()

            }
        }
}

