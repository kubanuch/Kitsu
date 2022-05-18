package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Characters
import com.google.gson.annotations.SerializedName

data class CharactersDto(
    @SerializedName("links")
    val links: LinksXXXXDto?
)

fun CharactersDto.toDomain() = Characters(
    links?.toDomain()
)