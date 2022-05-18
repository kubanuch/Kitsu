package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.LinksXXXXXXXXXXXXX

data class LinksXXXXXXXXXXXXXUi(
    val related: String?,
    val self: String?
)

fun LinksXXXXXXXXXXXXX.toUi() = LinksXXXXXXXXXXXXXUi(
    related, self
)

