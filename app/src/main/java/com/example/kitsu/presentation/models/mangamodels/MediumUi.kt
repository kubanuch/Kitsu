package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Medium

data class MediumUi(
    val height: Int?,
    val width: Int?
)

fun Medium.toUi() = MediumUi(
    height,
    width
)
