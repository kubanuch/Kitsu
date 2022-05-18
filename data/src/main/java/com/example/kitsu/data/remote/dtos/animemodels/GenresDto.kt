package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Genres
import com.google.gson.annotations.SerializedName

data class GenresDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXDto
)
fun GenresDto.toDomain() = Genres(
    links.toDomain()
)