package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.LinksXXXXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXDto(
    @SerializedName("related")
    val related: String?,
    @SerializedName("self")
    val self: String?
)

fun LinksXXXXXXXXXXDto.toDomain() = LinksXXXXXXXXXX(
    related, self
)