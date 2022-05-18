package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Quotes

data class QuotesUi(
    val links: LinksXXXXXXXXXXXXUi?
)

fun Quotes.toUi() = QuotesUi(
    links?.toUi()
)