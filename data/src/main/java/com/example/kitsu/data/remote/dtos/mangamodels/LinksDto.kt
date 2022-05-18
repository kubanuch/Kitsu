package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Links
import com.google.gson.annotations.SerializedName

data class LinksDto(
    @SerializedName("self")
    val self: String?
)

fun LinksDto.toDomain() = Links(
    self
)