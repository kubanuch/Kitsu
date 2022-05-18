package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Categories

data class CategoriesUi(
    val links: LinksXXUi?
)

fun Categories.toUi() = CategoriesUi(
    links?.toUi()
)