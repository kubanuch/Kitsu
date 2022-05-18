package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.LinksXXXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXDto(
    @SerializedName("related")
    val related: String?,
    @SerializedName("self")
    val self: String?
)

fun LinksXXXXXXXXXDto.toDomain() = LinksXXXXXXXXX(
    related, self
)