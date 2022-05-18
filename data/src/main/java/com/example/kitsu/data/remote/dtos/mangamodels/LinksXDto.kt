package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.LinksX
import com.google.gson.annotations.SerializedName

data class LinksXDto(
    @SerializedName("related")
    val related: String?,
    @SerializedName("self")
    val self: String?
)

fun LinksXDto.toDomain() = LinksX(
    related, self
)