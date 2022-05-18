package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Castings

data class CastingsUi(
    val links: LinksXXXXUi
)
fun Castings.toUi() =  CastingsUi(
    links.toUi()
)