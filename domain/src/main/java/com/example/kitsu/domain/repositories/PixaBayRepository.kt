package com.example.kitsu.domain.repositories

import com.example.kitsu.domain.either.Either
import com.example.kitsu.domain.models.PixaBayResponse
import kotlinx.coroutines.flow.Flow

interface PixaBayRepository {

    fun fetchPixabay(): Flow<Either<String, PixaBayResponse>>
}