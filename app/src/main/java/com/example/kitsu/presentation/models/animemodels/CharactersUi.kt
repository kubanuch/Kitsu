package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Characters

data class CharactersUi(
    val links: LinksXXXXXXUi
)
fun Characters.toUi() = CharactersUi(
    links.toUi()
)