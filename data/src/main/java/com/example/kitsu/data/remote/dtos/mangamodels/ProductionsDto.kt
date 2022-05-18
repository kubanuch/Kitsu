package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Productions
import com.google.gson.annotations.SerializedName

data class ProductionsDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXDto?
)

fun ProductionsDto.toDomain() = Productions(
    links?.toDomain()
)