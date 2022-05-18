package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.AnimeResponse

data class AnimeResponseUi(
    val data: List<AnimeModelUi>,
    val links: LinksXXXXXXXXXXXXXXXXXUi,
    val meta: MetaXXUi
)

fun AnimeResponse.toUi() = AnimeResponseUi(
    data.map {
        it.toUi()
    }, links.toUi(), meta.toUi()
)