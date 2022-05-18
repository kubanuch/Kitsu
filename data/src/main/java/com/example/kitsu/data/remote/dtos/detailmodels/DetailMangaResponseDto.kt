package com.example.kitsu.data.remote.dtos.detailmodels


import com.example.kitsu.data.remote.dtos.animemodels.AnimeModelDto
import com.example.kitsu.data.remote.dtos.animemodels.toDomain
import com.example.kitsu.data.remote.dtos.mangamodels.MangaModelDto
import com.example.kitsu.data.remote.dtos.mangamodels.toDomain
import com.example.kitsu.domain.models.detailmodels.DetailAnimeResponse
import com.example.kitsu.domain.models.detailmodels.DetailMangaResponse
import com.google.gson.annotations.SerializedName

data class DetailAnimeResponseDto(
    @SerializedName("data")
    val data: AnimeModelDto
)

data class DetailMangaResponseDto(
    @SerializedName("data")
    val data: MangaModelDto
)

fun DetailMangaResponseDto.toDomain() = DetailMangaResponse(
    data.toDomain()
)

fun DetailAnimeResponseDto.toDomain() = DetailAnimeResponse(
    data.toDomain()
)