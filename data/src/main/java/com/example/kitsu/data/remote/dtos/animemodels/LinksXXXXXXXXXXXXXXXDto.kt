package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXXXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXXXXXXDto(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)

fun LinksXXXXXXXXXXXXXXXDto.toDomain() = LinksXXXXXXXXXXXXXXX(
    related,
    self
)