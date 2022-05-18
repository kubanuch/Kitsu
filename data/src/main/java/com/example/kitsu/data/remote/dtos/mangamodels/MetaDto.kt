package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Meta
import com.google.gson.annotations.SerializedName

data class MetaDto(
    @SerializedName("dimensions")
    val dimensions: DimensionsDto?
)

fun MetaDto.toDomain() = Meta(
    dimensions?.toDomain()
)