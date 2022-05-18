package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.MangaResponse
import com.google.gson.annotations.SerializedName

data class MangaResponseDto(
    @SerializedName("data")
    val `data`: List<MangaModelDto>,
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXXXXDto,
    @SerializedName("meta")
    val meta: MetaXDto?
)

fun MangaResponseDto.toDomain() = MangaResponse(
    data.map { it.toDomain() },
    links.toDomain(),
    meta?.toDomain()
)