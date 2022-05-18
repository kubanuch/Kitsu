package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Large
import com.google.gson.annotations.SerializedName

data class LargeDto(
    @SerializedName("height")
    val height: Int?,
    @SerializedName("width")
    val width: Int?
)

fun LargeDto.toDomain() = Large(
    height, width
)