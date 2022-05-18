package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.LinksXXXX

data class LinksXXXXUi(
    val related: String?,
    val self: String?
)

fun LinksXXXX.toUi() = LinksXXXXUi(
    related, self
)