package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Medium
import com.google.gson.annotations.SerializedName

data class MediumDto(
    @SerializedName("height")
    val height: Int?,
    @SerializedName("width")
    val width: Int?
)

fun MediumDto.toDomain() = Medium(
    height, width
)