package com.example.kitsu.data.remote.apiservices

import com.example.kitsu.data.remote.dtos.genresmodels.GenresListDto
import retrofit2.http.GET
import retrofit2.http.Path

interface GenresApiService {
    @GET("anime/{id}genres")
    suspend fun fetchGenres(@Path("id") id: String): GenresListDto
}