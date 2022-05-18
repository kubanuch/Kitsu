package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.PosterImage
import com.google.gson.annotations.SerializedName

data class PosterImageDto(
    @SerializedName("large")
    val large: String?,
    @SerializedName("medium")
    val medium: String?,
    @SerializedName("meta")
    val meta: MetaDto?,
    @SerializedName("original")
    val original: String?,
    @SerializedName("small")
    val small: String?,
    @SerializedName("tiny")
    val tiny: String?
)

fun PosterImageDto.toDomain() = PosterImage(
    large,
    medium,
    meta?.toDomain(),
    original, small, tiny
)