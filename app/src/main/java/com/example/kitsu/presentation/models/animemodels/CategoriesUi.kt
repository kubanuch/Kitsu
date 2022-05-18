package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Categories

data class CategoriesUi(
    val links: LinksXXXXXUi
)
fun Categories.toUi() =  CategoriesUi(
    links.toUi()
)