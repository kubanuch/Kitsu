package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Mappings
import com.google.gson.annotations.SerializedName

data class MappingsDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXDto
)
fun MappingsDto.toDomain() = Mappings(
    links.toDomain()
)