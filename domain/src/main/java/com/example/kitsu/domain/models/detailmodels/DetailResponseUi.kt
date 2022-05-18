package com.example.kitsu.domain.models.detailmodels

import com.example.kitsu.domain.models.animemodels.AnimeModel
import com.example.kitsu.domain.models.mangamodels.MangaModel

data class DetailAnimeResponse(
    val data: AnimeModel
)

data class DetailMangaResponse(
    val data: MangaModel
)