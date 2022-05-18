package com.example.kitsu.presentation.models.detailmodels

import com.example.kitsu.domain.models.detailmodels.DetailAnimeResponse
import com.example.kitsu.domain.models.detailmodels.DetailMangaResponse
import com.example.kitsu.presentation.models.animemodels.AnimeModelUi
import com.example.kitsu.presentation.models.animemodels.toUi
import com.example.kitsu.presentation.models.mangamodels.MangaModelUi
import com.example.kitsu.presentation.models.mangamodels.toUi

data class DetailMangaResponseUi(
    val data: MangaModelUi
)

data class DetailAnimeResponseUi(
    val data: AnimeModelUi
)

fun DetailAnimeResponse.toUi() = DetailAnimeResponseUi(
    data.toUi()
)

fun DetailMangaResponse.toUi() = DetailMangaResponseUi(
    data.toUi()
)