package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXXDto(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)

fun LinksXXXXXXXXXXXDto.toDomain() = LinksXXXXXXXXXXX(
    related,
    self
)