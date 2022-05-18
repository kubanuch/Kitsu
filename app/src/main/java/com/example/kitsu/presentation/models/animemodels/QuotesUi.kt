package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Quotes

data class QuotesUi(
    val links: LinksXXXXXXXXXXXXXUi
)
fun Quotes.toUi() = QuotesUi(
    links.toUi()
)