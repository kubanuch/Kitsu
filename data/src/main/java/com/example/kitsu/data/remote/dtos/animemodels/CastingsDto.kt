package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Castings
import com.google.gson.annotations.SerializedName

data class CastingsDto(
    @SerializedName("links")
    val links: LinksXXXXDto
)
fun CastingsDto.toDomain() = Castings(
    links.toDomain()
)