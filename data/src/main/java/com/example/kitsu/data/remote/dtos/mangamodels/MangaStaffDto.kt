package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.MangaStaff
import com.google.gson.annotations.SerializedName

data class MangaStaffDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXDto?
)

fun MangaStaffDto.toDomain() = MangaStaff(
    links?.toDomain()
)