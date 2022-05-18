package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.LinksXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXDto(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)
fun LinksXXXXXXDto.toDomain() = LinksXXXXXX(
    related,
    self
)