package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.CoverImage
import com.google.gson.annotations.SerializedName

data class CoverImageDto(
    @SerializedName("large")
    val large: String,
    @SerializedName("meta")
    val meta: MetaDto,
    @SerializedName("original")
    val original: String,
    @SerializedName("small")
    val small: String,
    @SerializedName("tiny")
    val tiny: String
)

fun CoverImageDto.toDomain() = meta.toDomain()?.let {
    CoverImage(
        large, it, original, small, tiny
    )
}