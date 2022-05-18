package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.MetaX
import com.google.gson.annotations.SerializedName

data class MetaXDto(
    @SerializedName("dimensions")
    val dimensions: DimensionsXDto
)
fun MetaXDto.toDomain() = MetaX(
    dimensions.toDomain()
)