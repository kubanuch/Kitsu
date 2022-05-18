package com.example.kitsu.domain.repositories

import com.example.kitsu.domain.models.authentication.TokenModel
import com.example.kitsu.domain.either.Either
import kotlinx.coroutines.flow.Flow

interface AuthenticationRepository {
    fun authenticate(username: String, Password: String): Flow<Either<String, TokenModel>>
}