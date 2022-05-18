package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Tiny

data class TinyUi(
    val height: Int?,
    val width: Int?
)

fun Tiny.toUi() = TinyUi(
    height,
    width
)