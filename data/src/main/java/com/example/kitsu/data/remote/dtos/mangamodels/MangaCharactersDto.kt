package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.MangaCharacters
import com.google.gson.annotations.SerializedName

data class MangaCharactersDto(
    @SerializedName("links")
    val links: LinksXXXXXXXDto?
)

fun MangaCharactersDto.toDomain() = MangaCharacters(
    links?.toDomain()
)