package com.example.kitsu.data.repositories

import com.example.kitsu.data.preferences.PreferencesHelper
import com.example.kitsu.data.remote.apiservices.AuthenticationApiService
import com.example.kitsu.data.remote.dtos.authmodels.AuthDto
import com.example.kitsu.data.remote.dtos.authmodels.toDomain
import com.example.kitsu.data.repositories.base.BaseRepository
import com.example.kitsu.domain.models.authentication.TokenModel
import com.example.kitsu.domain.either.Either
import com.example.kitsu.domain.repositories.AuthenticationRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AuthenticationRepositoryImpl @Inject constructor(
    private val service: AuthenticationApiService,
    private val preferencesHelper: PreferencesHelper
) :
    BaseRepository(), AuthenticationRepository {
    override fun authenticate(
        username: String,
        Password: String
    ): Flow<Either<String, TokenModel>> = doRequest(this::saveToken) {
        service.authenticate(AuthDto(username = username, password = Password)).toDomain()
    }

    private fun saveToken(tokenModel: TokenModel) {
        preferencesHelper.accessToken = tokenModel.accessToken
        preferencesHelper.refreshToken = tokenModel.refreshToken
        preferencesHelper.isAuthenticated = true
    }
}