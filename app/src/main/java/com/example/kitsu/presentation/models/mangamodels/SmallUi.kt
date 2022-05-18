package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Small

data class SmallUi(
    val height: Int?,
    val width: Int?
)

fun Small.toUi() = SmallUi(
    height,
    width,
)