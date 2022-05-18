package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.LinksXXXXXX

data class LinksXXXXXXUi(
    val related: String?,
    val self: String?
)

fun LinksXXXXXX.toUi() = LinksXXXXXXUi(
    related, self
)