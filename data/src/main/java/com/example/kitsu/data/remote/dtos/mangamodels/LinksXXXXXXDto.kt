package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.LinksXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXDto(
    @SerializedName("related")
    val related: String?,
    @SerializedName("self")
    val self: String?
)

fun LinksXXXXXXDto.toDomain() = LinksXXXXXX(
    related, self
)