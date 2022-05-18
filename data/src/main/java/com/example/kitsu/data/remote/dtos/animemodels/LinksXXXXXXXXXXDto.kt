package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXDto(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)

fun LinksXXXXXXXXXXDto.toDomain() = LinksXXXXXXXXXX(
    related,
    self
)