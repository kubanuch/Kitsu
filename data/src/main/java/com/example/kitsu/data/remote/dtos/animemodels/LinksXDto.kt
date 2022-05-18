package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.LinksX
import com.google.gson.annotations.SerializedName

data class LinksXDto(
    @SerializedName("related")
    val related: String?,
    @SerializedName("self")
    val self: String?
)

fun LinksXDto.toDomain() = related?.let {
    self?.let { it1 ->
        LinksX(it, it1)
    }
}