package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.AnimeProductions
import com.google.gson.annotations.SerializedName

data class AnimeProductionsDto(
    @SerializedName("links")
    val links: LinksXXDto
)
fun AnimeProductionsDto.toDomain() = AnimeProductions(
    links.toDomain()
)
