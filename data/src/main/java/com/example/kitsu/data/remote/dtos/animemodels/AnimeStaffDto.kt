package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.AnimeStaff
import com.google.gson.annotations.SerializedName

data class AnimeStaffDto(
    @SerializedName("links")
    val links: LinksXXXDto
)
fun AnimeStaffDto.toDomain() = AnimeStaff(
    links.toDomain()
)