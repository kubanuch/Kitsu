package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.AnimeResponse
import com.google.gson.annotations.SerializedName

data class AnimeResponseDto(
    @SerializedName("data")
    val data: List<AnimeModelDto>,
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXXXXXXDto,
    @SerializedName("meta")
    val meta: MetaXXDto
)

fun AnimeResponseDto.toDomain() = data.map {
    it.toDomain()
}.let {
    AnimeResponse(
        it, links.toDomain(), meta.toDomain()
    )
}