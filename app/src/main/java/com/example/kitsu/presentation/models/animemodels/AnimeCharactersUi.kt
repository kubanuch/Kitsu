package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.AnimeCharacters

data class AnimeCharactersUi(
    val links: LinksXUi
)

fun AnimeCharacters.toUi() = AnimeCharactersUi(links.toUi())

