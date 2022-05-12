package com.example.kitsu.data.remote.apiservices

import com.example.kitsu.data.remote.dtos.animemodels.AnimeResponseDto
import com.example.kitsu.data.remote.dtos.detailmodels.DetailAnimeResponseDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AnimeApiService {

    @GET("anime")
    suspend fun fetchAnime(
        @Query("sort") param: String,
        @Query("page[limit]") pageLimit: Int,
        @Query("page[offset]") pageOffset: Int,
    ): AnimeResponseDto

    @GET("anime/{id}")
    suspend fun fetchAnimeId(@Path("id") id: String): DetailAnimeResponseDto
}