package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Productions
import com.google.gson.annotations.SerializedName

data class ProductionsDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXDto
)
fun ProductionsDto.toDomain() = Productions(
    links.toDomain()
)