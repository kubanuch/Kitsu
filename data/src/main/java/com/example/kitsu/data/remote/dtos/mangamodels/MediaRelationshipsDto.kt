package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.MediaRelationships
import com.google.gson.annotations.SerializedName

data class MediaRelationshipsDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXDto?
)

fun MediaRelationshipsDto.toDomain() = MediaRelationships(
    links?.toDomain()
)