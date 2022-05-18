package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Staff
import com.google.gson.annotations.SerializedName

data class StaffDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXXXDto?
)

fun StaffDto.toDomain() = Staff(
    links?.toDomain()
)