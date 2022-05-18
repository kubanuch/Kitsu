package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.RatingFrequencies

data class RatingFrequenciesUi(
    val `10`: String?,
    val `11`: String?,
    val `12`: String?,
    val `13`: String?,
    val `14`: String?,
    val `15`: String?,
    val `16`: String?,
    val `17`: String?,
    val `18`: String?,
    val `19`: String?,
    val `2`: String?,
    val `20`: String?,
    val `3`: String?,
    val `4`: String?,
    val `5`: String?,
    val `6`: String?,
    val `7`: String?,
    val `8`: String?,
    val `9`: String?
)

fun RatingFrequencies.toUi() = RatingFrequenciesUi(
    `10`,
    `11`,
    `12`,
    `13`,
    `14`,
    `15`,
    `16`,
    `17`,
    `18`,
    `19`,
    `2`,
    `20`,
    `3`,
    `4`,
    `5`,
    `6`,
    `7`,
    `8`,
    `9`
)
