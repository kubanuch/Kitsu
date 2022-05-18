package com.example.kitsu.data.remote.apiservices

import com.example.kitsu.data.remote.dtos.authmodels.AuthDto
import com.example.kitsu.data.remote.dtos.authmodels.TokenDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationApiService {
    @POST("token")
    suspend fun authenticate(@Body authDto: AuthDto): TokenDto
}