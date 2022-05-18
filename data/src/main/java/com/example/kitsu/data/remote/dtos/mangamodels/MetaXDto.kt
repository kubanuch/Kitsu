package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.MetaX
import com.google.gson.annotations.SerializedName

data class MetaXDto(
    @SerializedName("count")
    val count: Int?
)

fun MetaXDto.toDomain() = MetaX(
    count
)