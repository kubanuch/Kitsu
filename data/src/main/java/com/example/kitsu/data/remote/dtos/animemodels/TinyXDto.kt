package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.TinyX
import com.google.gson.annotations.SerializedName


data class TinyXDto(
    @SerializedName("height")
    val height: Int,
    @SerializedName("width")
    val width: Int
)

fun TinyXDto.toDomain() = TinyX(
    height,
    width
)