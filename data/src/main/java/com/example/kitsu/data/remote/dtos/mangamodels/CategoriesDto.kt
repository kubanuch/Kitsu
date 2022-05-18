package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Categories
import com.google.gson.annotations.SerializedName

data class CategoriesDto(
    @SerializedName("links")
    val links: LinksXXDto?
)

fun CategoriesDto.toDomain() = Categories(
    links?.toDomain()
)