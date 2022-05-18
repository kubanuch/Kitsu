package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.AnimeModel
import com.google.gson.annotations.SerializedName

data class AnimeModelDto(
    @SerializedName("attributes")
    val attributes: AttributesDto,
    @SerializedName("id")
    val id: String,
    @SerializedName("links")
    val links: LinksDto,
    @SerializedName("relationships")
    val relationships: RelationshipsDto,
    @SerializedName("type")
    val type: String?
)

fun AnimeModelDto.toDomain() =
    AnimeModel(
        attributes.toDomain(),
        id,
        links.toDomain(),
        relationships.toDomain(),
        type
    )