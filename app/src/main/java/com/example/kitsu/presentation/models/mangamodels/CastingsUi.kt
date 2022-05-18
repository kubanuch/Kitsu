package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Castings

data class CastingsUi(
    val links: LinksXUi?
)

fun Castings.toUi() = CastingsUi(
    links?.toUi()
)