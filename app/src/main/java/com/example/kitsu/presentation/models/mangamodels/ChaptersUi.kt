package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Chapters

data class ChaptersUi(
    val links: LinksXXXUi?
)

fun Chapters.toUi() = ChaptersUi(
    links?.toUi()
)