package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Episodes
import com.google.gson.annotations.SerializedName

data class EpisodesDto(
    @SerializedName("links")
    val links: LinksXXXXXXXDto
)
fun  EpisodesDto.toDomain() = Episodes(
    links.toDomain()
)