package com.example.kitsu.data.remote.dtos.genresmodels

import com.example.kitsu.domain.models.genresmodels.LinksModel
import com.google.gson.annotations.SerializedName

data class LinksModelDto(
    @SerializedName("last")
    val last: String?,
    @SerializedName("first")
    val first: String,
)

fun LinksModelDto.toDomain() = LinksModel(last, first)