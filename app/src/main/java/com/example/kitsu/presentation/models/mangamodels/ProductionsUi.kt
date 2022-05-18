package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Productions

data class ProductionsUi(
    val links: LinksXXXXXXXXXXXUi?
)

fun Productions.toUi() = ProductionsUi(
    links?.toUi()
)