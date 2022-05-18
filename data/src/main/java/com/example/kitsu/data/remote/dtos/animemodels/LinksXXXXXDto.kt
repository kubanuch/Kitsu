package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.LinksXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXDto(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)

fun LinksXXXXXDto.toDomain() = LinksXXXXX(
    related,
    self
)
