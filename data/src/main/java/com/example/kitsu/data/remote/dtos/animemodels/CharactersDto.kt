package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Characters
import com.google.gson.annotations.SerializedName


data class CharactersDto(
    @SerializedName("links")
    val links: LinksXXXXXXDto
)
fun CharactersDto.toDomain() = Characters(
    links.toDomain()
)
