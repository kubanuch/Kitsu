package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.MetaXX
import com.google.gson.annotations.SerializedName

data class MetaXXDto(
    @SerializedName("count")
    val count: Int
)
fun MetaXXDto.toDomain() = MetaXX(
    count
)