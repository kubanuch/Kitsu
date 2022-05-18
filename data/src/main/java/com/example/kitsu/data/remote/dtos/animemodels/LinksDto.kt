package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Links
import com.google.gson.annotations.SerializedName

data class LinksDto(
    @SerializedName("self")
    val self: String
)

fun LinksDto.toDomain() = Links(
    self
)