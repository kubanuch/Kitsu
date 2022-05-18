package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Chapters
import com.google.gson.annotations.SerializedName

data class ChaptersDto(
    @SerializedName("links")
    val links: LinksXXXDto?
)

fun ChaptersDto.toDomain() = Chapters(
    links?.toDomain()
)