package com.example.kitsu.data.remote.dtos.genresmodels

import com.example.kitsu.domain.models.genresmodels.GenresModels
import com.google.gson.annotations.SerializedName

data class GenresModelsDto(
    @SerializedName("links")
    val links: LinksModelDto,
    @SerializedName("attributes")
    val attributes: AttributesModelsDto,
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: String,
)

fun GenresModelsDto.toDomain() = GenresModels(
    links.toDomain(),
    attributes.toDomain(),
    id,
    type
)