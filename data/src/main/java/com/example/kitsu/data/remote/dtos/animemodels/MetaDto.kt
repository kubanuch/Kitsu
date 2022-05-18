package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Meta
import com.google.gson.annotations.SerializedName

data class MetaDto(
    @SerializedName("dimensions")
    val dimensions: DimensionsDto?
)

fun MetaDto.toDomain() = dimensions?.let {
    Meta(
        it.toDomain()
    )
}