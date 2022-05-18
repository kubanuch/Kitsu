package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.LinksXXXXXXXXXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXXXXXXDto(
    @SerializedName("first")
    val first: String?,
    @SerializedName("last")
    val last: String?,
    @SerializedName("next")
    val next: String?,
)

fun LinksXXXXXXXXXXXXXXXDto.toDomain() = LinksXXXXXXXXXXXXXXX(
    first, last
)