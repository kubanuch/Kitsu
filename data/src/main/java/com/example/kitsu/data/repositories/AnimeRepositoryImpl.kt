package com.example.kitsu.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.map
import com.example.kitsu.data.pagingsource.AnimePagingSource
import com.example.kitsu.data.remote.apiservices.AnimeApiService
import com.example.kitsu.data.remote.dtos.animemodels.toDomain
import com.example.kitsu.data.remote.dtos.detailmodels.toDomain
import com.example.kitsu.data.repositories.base.BaseRepository
import com.example.kitsu.domain.models.animemodels.AnimeModel
import com.example.kitsu.domain.repositories.AnimeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class AnimeRepositoryImpl @Inject constructor(
    private val service: AnimeApiService
) : BaseRepository(), AnimeRepository {

    fun fetchAnime(param: String): Flow<PagingData<AnimeModel>> {
        return Pager(
            config = PagingConfig(pageSize = 20, initialLoadSize = 10),
            pagingSourceFactory = { AnimePagingSource(service, param) }
        ).flow.map { pagingData ->
            pagingData.map {
                it.toDomain()
            }
        }
    }

    override fun fetchAnimeId(id: String) = doRequest {
        service.fetchAnimeId(id).toDomain()
    }
}