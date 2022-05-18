package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.CoverImage

data class CoverImageUi(
    val large: String,
    val meta: MetaUi,
    val original: String,
    val small: String,
    val tiny: String
)

fun CoverImage.toUi() = CoverImageUi(
    large, meta.toUi(), original, small, tiny
)