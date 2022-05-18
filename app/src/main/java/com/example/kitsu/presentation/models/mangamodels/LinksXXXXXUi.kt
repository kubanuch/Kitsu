package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.LinksXXXXX

data class LinksXXXXXUi(
    val related: String?,
    val self: String?
)

fun LinksXXXXX.toUi() = LinksXXXXXUi(
    related, self
)