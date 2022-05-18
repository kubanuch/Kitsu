package com.example.kitsu.data.remote.dtos.genresmodels

import com.example.kitsu.domain.models.genresmodels.GenresList
import com.google.gson.annotations.SerializedName

data class GenresListDto(
    @SerializedName("data")
    val data: List<GenresModelsDto>,
    @SerializedName("meta")
    val meta: MetaModelDto? = null,
    @SerializedName("links")
    val links: LinksModelDto? = null,
)

fun GenresListDto.toDomain() = GenresList(
    data.map { it.toDomain() },
    meta?.toDomain(),
    links?.toDomain()
)