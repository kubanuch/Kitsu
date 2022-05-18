package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Large

data class LargeUi(
    val height: Int?,
    val width: Int?
)

fun Large.toUi() = LargeUi(
    height,
    width,
)