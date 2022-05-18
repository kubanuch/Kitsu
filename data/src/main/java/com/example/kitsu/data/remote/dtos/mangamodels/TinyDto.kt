package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Tiny
import com.google.gson.annotations.SerializedName

data class TinyDto(
    @SerializedName("height")
    val height: Int?,
    @SerializedName("width")
    val width: Int?
)

fun TinyDto.toDomain() = Tiny(
    height, width
)