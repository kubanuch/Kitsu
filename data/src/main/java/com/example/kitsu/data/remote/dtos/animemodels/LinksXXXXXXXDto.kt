package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.LinksXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXDto(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)

fun LinksXXXXXXXDto.toDomain() = LinksXXXXXXX(
    related,
    self
)