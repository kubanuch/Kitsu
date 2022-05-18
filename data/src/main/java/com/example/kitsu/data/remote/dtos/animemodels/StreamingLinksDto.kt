package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.StreamingLinks
import com.google.gson.annotations.SerializedName

data class StreamingLinksDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXXXXXDto
)
fun StreamingLinksDto.toDomain() = StreamingLinks(
    links.toDomain()
)