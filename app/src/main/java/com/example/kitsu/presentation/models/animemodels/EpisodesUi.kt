package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Episodes

data class EpisodesUi(
    val links: LinksXXXXXXXUi
)
fun Episodes.toUi() = EpisodesUi(
    links.toUi()
)