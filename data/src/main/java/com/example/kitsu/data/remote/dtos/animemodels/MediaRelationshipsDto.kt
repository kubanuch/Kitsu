package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.MediaRelationships
import com.google.gson.annotations.SerializedName

data class MediaRelationshipsDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXDto
)
fun MediaRelationshipsDto.toDomain() = MediaRelationships(
    links.toDomain()
)