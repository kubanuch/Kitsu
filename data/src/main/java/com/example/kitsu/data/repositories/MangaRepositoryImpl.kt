package com.example.kitsu.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.map
import com.example.kitsu.data.pagingsource.MangaPagingSource
import com.example.kitsu.data.remote.apiservices.MangaApiService
import com.example.kitsu.data.remote.dtos.detailmodels.toDomain
import com.example.kitsu.data.remote.dtos.mangamodels.toDomain
import com.example.kitsu.data.repositories.base.BaseRepository
import com.example.kitsu.domain.models.mangamodels.MangaModel
import com.example.kitsu.domain.repositories.MangaRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class MangaRepositoryImpl @Inject constructor(
    private val serviceManga: MangaApiService
) : BaseRepository(), MangaRepository {

    fun fetchManga(manga: String): Flow<PagingData<MangaModel>> {
        return Pager(
            config = PagingConfig(pageSize = 20, initialLoadSize = 10),
            pagingSourceFactory = { MangaPagingSource(serviceManga, manga) }
        ).flow.map { pagingData ->
            pagingData.map {
                it.toDomain()
            }
        }
    }

    override fun fetchMangaId(id: String) = doRequest {
        serviceManga.fetchMangaId(id).toDomain()
    }
}