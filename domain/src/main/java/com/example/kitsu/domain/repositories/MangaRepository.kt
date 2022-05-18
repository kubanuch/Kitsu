package com.example.kitsu.domain.repositories

import com.example.kitsu.domain.either.Either
import com.example.kitsu.domain.models.detailmodels.DetailMangaResponse
import kotlinx.coroutines.flow.Flow

interface MangaRepository {
    fun fetchMangaId(id: String): Flow<Either<String, DetailMangaResponse>>
}