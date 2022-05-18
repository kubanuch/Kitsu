package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Titles

data class TitlesUi(
    val en: String?,
    val en_jp: String?,
    val ja_jp: String?
)

fun Titles.toUi() = TitlesUi(
    en,
    en_jp,
    ja_jp
)