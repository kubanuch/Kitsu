package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXXXXXXXXXXX

data class LinksXXXXXXXXXXXXXXXXXUi(
    val first: String?,
    val last: String?,
    val next: String?,
    val prev: String?
)

fun LinksXXXXXXXXXXXXXXXXX.toUi() = LinksXXXXXXXXXXXXXXXXXUi(
    first,
    last,
    next,
    prev
)