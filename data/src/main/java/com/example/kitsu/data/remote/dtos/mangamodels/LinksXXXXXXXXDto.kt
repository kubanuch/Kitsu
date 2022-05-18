package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.LinksXXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXDto(
    @SerializedName("related")
    val related: String?,
    @SerializedName("self")
    val self: String?
)

fun LinksXXXXXXXXDto.toDomain() = LinksXXXXXXXX(
    related, self
)