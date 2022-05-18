package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.LinksXXXXXXXXXXXXXXX

data class LinksXXXXXXXXXXXXXXXUi(
    val first: String?,
    val last: String?
)

fun LinksXXXXXXXXXXXXXXX.toUi() = LinksXXXXXXXXXXXXXXXUi(
    first, last
)