package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Installments
import com.google.gson.annotations.SerializedName

data class InstallmentsDto(
    @SerializedName("links")
    val links: LinksXXXXXXDto?
)

fun InstallmentsDto.toDomain() = Installments(
    links?.toDomain()
)