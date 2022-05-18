package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Reviews
import com.google.gson.annotations.SerializedName

data class ReviewsDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXXDto?
)

fun ReviewsDto.toDomain() = Reviews(
    links?.toDomain()
)