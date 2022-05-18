package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Genres
import com.google.gson.annotations.SerializedName

data class GenresDto(
    @SerializedName("links")
    val links: LinksXXXXXDto?
)

fun GenresDto.toDomain() = Genres(
    links?.toDomain()
)