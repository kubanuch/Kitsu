package com.example.kitsu.presentation.ui.fragment.main.anime

import androidx.paging.map
import com.example.kitsu.base.BaseViewModel
import com.example.kitsu.data.repositories.AnimeRepositoryImpl
import com.example.kitsu.presentation.models.animemodels.toUi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(private val repositoryImpl: AnimeRepositoryImpl) :
    BaseViewModel() {

    fun fetchPopularAnime(param: String) =
        repositoryImpl.fetchAnime(param).map { pagingData ->
            pagingData.map {
                it.toUi()
            }
        }

    fun fetchRatingAnime(param: String) =
        repositoryImpl.fetchAnime(param).map { pagingData ->
            pagingData.map {
                it.toUi()
            }
        }
}