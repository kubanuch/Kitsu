package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.LinksXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXDto(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)

fun LinksXXXDto.toDomain() = LinksXXX(
    related,
    self
)