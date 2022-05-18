package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.AnimeProductions

data class AnimeProductionsUi(
    val links: LinksXXUi
)

fun AnimeProductions.toUi() = AnimeProductionsUi(
    links.toUi()
)