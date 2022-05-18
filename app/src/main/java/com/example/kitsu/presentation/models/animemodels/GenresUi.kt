package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Genres

data class GenresUi(
    val links: LinksXXXXXXXXUi
)
fun Genres.toUi() = GenresUi(
    links.toUi()
)