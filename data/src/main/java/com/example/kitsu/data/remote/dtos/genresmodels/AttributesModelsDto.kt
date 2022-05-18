package com.example.kitsu.data.remote.dtos.genresmodels

import com.example.kitsu.domain.models.genresmodels.AttributesModels
import com.google.gson.annotations.SerializedName

data class AttributesModelsDto(
    @SerializedName("createAt")
    val createAt: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("description")
    val description: String?,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("updateAt")
    val updateAt: String,
)

fun AttributesModelsDto.toDomain() = AttributesModels(
    createAt,
    name, description, slug, updateAt
)