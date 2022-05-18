package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.MangaCharacters

data class MangaCharactersUi(
    val links: LinksXXXXXXXUi?
)

fun MangaCharacters.toUi() = MangaCharactersUi(
    links?.toUi()
)