package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXXXXXXXX
import com.google.gson.annotations.SerializedName


data class LinksXXXXXXXXXXXXXXDto(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)

fun LinksXXXXXXXXXXXXXXDto.toDomain() = LinksXXXXXXXXXXXXXX(
    related,
    self
)