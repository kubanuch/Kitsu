package com.example.kitsu.domain.repositories

import com.example.kitsu.domain.either.Either
import com.example.kitsu.domain.models.detailmodels.DetailAnimeResponse
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {

    fun fetchAnimeId(id: String): Flow<Either<String, DetailAnimeResponse>>
}