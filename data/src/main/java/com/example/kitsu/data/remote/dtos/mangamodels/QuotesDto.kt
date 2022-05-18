package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Quotes
import com.google.gson.annotations.SerializedName

data class QuotesDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXDto?
)

fun QuotesDto.toDomain() = Quotes(
    links?.toDomain()
)