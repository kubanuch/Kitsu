package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.DimensionsX
import com.google.gson.annotations.SerializedName

data class DimensionsXDto(
    @SerializedName("large")
    val large: LargeXDto,
    @SerializedName("medium")
    val medium: MediumDto,
    @SerializedName("small")
    val small: SmallXDto,
    @SerializedName("tiny")
    val tiny: TinyXDto
)

fun DimensionsXDto.toDomain() = DimensionsX(
    large.toDomain(),
    medium.toDomain(),
    small.toDomain(),
    tiny.toDomain()

)