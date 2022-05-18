package com.example.kitsu.data.remote.dtos.genresmodels

import com.example.kitsu.domain.models.genresmodels.MetaModel
import com.google.gson.annotations.SerializedName

data class MetaModelDto(
    @SerializedName("count")
    val count: Int = 0
)

fun MetaModelDto.toDomain() = MetaModel(count)
