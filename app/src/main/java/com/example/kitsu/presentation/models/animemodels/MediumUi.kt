package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Medium

data class MediumUi(
    val height: Int,
    val width: Int
)

fun Medium.toUi() = MediumUi(
    height,
    width
)