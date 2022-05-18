package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Tiny
import com.google.gson.annotations.SerializedName

data class TinyDto(
    @SerializedName("height")
    val height: Int,
    @SerializedName("width")
    val width: Int
)
fun TinyDto.toDomain() = Tiny(
    height,width
)