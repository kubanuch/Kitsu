package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Small
import com.google.gson.annotations.SerializedName

data class SmallDto(
    @SerializedName("height")
    val height: Int,
    @SerializedName("width")
    val width: Int
)

fun SmallDto.toDomain() = Small(
    height, width
)