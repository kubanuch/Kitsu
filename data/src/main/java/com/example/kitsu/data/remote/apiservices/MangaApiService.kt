package com.example.kitsu.data.remote.apiservices

import com.example.kitsu.data.remote.dtos.detailmodels.DetailMangaResponseDto
import com.example.kitsu.data.remote.dtos.mangamodels.MangaResponseDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MangaApiService {
    @GET("manga")
    suspend fun fetchManga(
        @Query("sort") param: String,
        @Query("page[limit]") limit: Int,
        @Query("page[offset]") offset: Int
    ): MangaResponseDto

    @GET("manga/{id}")
    suspend fun fetchMangaId(@Path("id") id: String): DetailMangaResponseDto
}