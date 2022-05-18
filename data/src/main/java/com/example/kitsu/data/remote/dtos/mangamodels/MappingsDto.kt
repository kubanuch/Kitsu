package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Mappings
import com.google.gson.annotations.SerializedName

data class MappingsDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXDto?
)

fun MappingsDto.toDomain() = Mappings(
    links?.toDomain()
)