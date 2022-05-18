package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.LinksXX
import com.google.gson.annotations.SerializedName

data class LinksXXDto(
    @SerializedName("related")
    val related: String,
    @SerializedName("self")
    val self: String
)

fun LinksXXDto.toDomain() = LinksXX(
    related,
    self

)