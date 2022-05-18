package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.SmallX
import com.google.gson.annotations.SerializedName

data class SmallXDto(
    @SerializedName("height")
    val height: Int,
    @SerializedName("width")
    val width: Int
)

fun SmallXDto.toDomain() = SmallX(
    height,
    width
)