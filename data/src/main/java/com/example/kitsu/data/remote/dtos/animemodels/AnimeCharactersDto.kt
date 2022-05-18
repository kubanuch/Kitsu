package com.example.kitsu.data.remote.dtos.animemodels

import com.example.kitsu.domain.models.animemodels.AnimeCharacters
import com.google.gson.annotations.SerializedName

data class AnimeCharactersDto(
    @SerializedName("links")
    val links: LinksXDto?
)

fun AnimeCharactersDto.toDomain() = links.let {
    it?.toDomain()?.let { it1 ->
        AnimeCharacters(
            it1
        )
    }
}