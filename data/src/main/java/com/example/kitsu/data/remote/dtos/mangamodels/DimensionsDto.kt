package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Dimensions
import com.google.gson.annotations.SerializedName

data class DimensionsDto(
    @SerializedName("large")
    val large: LargeDto?,
    @SerializedName("medium")
    val medium: MediumDto?,
    @SerializedName("small")
    val small: SmallDto?,
    @SerializedName("tiny")
    val tiny: TinyDto?
)

fun DimensionsDto.toDomain() = Dimensions(
    large?.toDomain(),
    medium?.toDomain(),
    small?.toDomain(),
    tiny?.toDomain()
)