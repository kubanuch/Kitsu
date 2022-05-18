package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Staff
import com.google.gson.annotations.SerializedName

data class StaffDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXXXXDto
)
fun StaffDto.toDomain() = Staff(
    links.toDomain()
)