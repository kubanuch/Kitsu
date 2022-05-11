package com.example.kitsu.data.remote.dtos

import com.example.kitsu.domain.models.PixaBayResponse
import com.google.gson.annotations.SerializedName

data class PixaBayResponseDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("totalHist")
    val totalHist: Int?,
    @SerializedName("hits")
    val hits: List<PixaBayModelDto>,
)


fun PixaBayResponseDto.toDomain() = PixaBayResponse(id, totalHist, hits.map {
    it.toDomain()
})

