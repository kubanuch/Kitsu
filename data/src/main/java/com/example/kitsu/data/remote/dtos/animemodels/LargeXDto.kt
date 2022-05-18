package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.LargeX
import com.google.gson.annotations.SerializedName

data class LargeXDto(
    @SerializedName("height")
    val height: Int,
    @SerializedName("width")
    val width: Int
)
fun LargeXDto.toDomain() = LargeX(
    height,
    width
)