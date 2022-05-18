package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Categories
import com.google.gson.annotations.SerializedName

data class CategoriesDto(
    @SerializedName("links")
    val links: LinksXXXXXDto
)
fun CategoriesDto.toDomain() = Categories(
    links.toDomain()
)