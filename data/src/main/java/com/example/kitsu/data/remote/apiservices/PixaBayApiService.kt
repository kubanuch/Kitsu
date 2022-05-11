package com.example.kitsu.data.remote.apiservices

import com.example.kitsu.data.remote.dtos.PixaBayResponseDto
import retrofit2.http.GET

interface PixaBayApiService {

    @GET("?key=25973111-24329f9f2d4e8aac3285bdcee")
    suspend fun fetchPixabay(): PixaBayResponseDto
}