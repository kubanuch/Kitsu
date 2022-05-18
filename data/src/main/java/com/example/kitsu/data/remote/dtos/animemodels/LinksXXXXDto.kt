package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.LinksXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXDto(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)

fun LinksXXXXDto.toDomain() = LinksXXXX(
    related,
    self
)