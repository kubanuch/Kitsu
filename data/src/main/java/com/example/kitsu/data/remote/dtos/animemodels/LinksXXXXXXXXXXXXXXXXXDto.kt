package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXXXXXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXXXXXXXXDto(
    @SerializedName("first")
    val first: String?,
    @SerializedName("last")
    val last: String?,
    @SerializedName("next")
    val next: String?,
    @SerializedName("prev")
    val prev: String?
)

fun LinksXXXXXXXXXXXXXXXXXDto.toDomain() = LinksXXXXXXXXXXXXXXXXX(
    first,
    last,
    next,
    prev
)