package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Quotes
import com.google.gson.annotations.SerializedName

data class QuotesDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXXDto
)
fun QuotesDto.toDomain() = Quotes(
    links.toDomain()
)