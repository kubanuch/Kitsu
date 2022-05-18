package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Reviews
import com.google.gson.annotations.SerializedName

data class ReviewsDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXXXDto
)
fun ReviewsDto.toDomain() = Reviews(
    links.toDomain()
)