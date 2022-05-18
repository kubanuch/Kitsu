package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Genres

data class GenresUi(
    val links: LinksXXXXXUi?
)

fun Genres.toUi() = GenresUi(
    links?.toUi()
)