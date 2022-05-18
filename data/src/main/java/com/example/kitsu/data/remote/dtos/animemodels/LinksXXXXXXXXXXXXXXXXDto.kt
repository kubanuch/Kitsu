package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXXXXXXXXXX
import com.google.gson.annotations.SerializedName


data class LinksXXXXXXXXXXXXXXXXDto(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)

fun LinksXXXXXXXXXXXXXXXXDto.toDomain() = LinksXXXXXXXXXXXXXXXX(
    related,
    self
)