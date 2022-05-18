package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Installments
import com.google.gson.annotations.SerializedName

data class InstallmentsDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXDto
)
fun InstallmentsDto.toDomain() = Installments(
    links.toDomain()
)