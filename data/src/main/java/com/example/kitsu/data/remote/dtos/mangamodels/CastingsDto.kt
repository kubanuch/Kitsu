package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Castings
import com.google.gson.annotations.SerializedName

data class CastingsDto(
    @SerializedName("links")
    val links: LinksXDto?
)

fun CastingsDto.toDomain() = Castings(
    links?.toDomain()
)