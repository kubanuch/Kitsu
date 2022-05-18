package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Dimensions
import com.google.gson.annotations.SerializedName

data class DimensionsDto(
    @SerializedName("large")
    val large: LargeDto,
    @SerializedName("small")
    val small: SmallDto,
    @SerializedName("tiny")
    val tiny: TinyDto
)
fun DimensionsDto.toDomain() = Dimensions(
    large.toDomain(), small.toDomain(),
    tiny.toDomain()
)