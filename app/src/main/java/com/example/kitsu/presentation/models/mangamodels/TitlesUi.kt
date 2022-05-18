package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Titles

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