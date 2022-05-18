package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Characters

data class CharactersUi(
    val links: LinksXXXXUi?
)

fun Characters.toUi() = CharactersUi(
    links?.toUi()
)