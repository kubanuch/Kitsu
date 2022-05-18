package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Productions

data class ProductionsUi(
    val links: LinksXXXXXXXXXXXXUi
)
fun Productions.toUi() = ProductionsUi(
    links.toUi()
)