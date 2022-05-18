package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.MangaModel
import com.google.gson.annotations.SerializedName

data class MangaModelDto(
    @SerializedName("attributes")
    val attributes: AttributesDto,
    @SerializedName("id")
    val id: String?,
    @SerializedName("links")
    val links: LinksDto?,
    @SerializedName("relationships")
    val relationships: RelationshipsDto?,
    @SerializedName("type")
    val type: String?
)

fun MangaModelDto.toDomain() = MangaModel(
    attributes.toDomain(),
    id,
    links?.toDomain(),
    relationships?.toDomain(),
    type
)