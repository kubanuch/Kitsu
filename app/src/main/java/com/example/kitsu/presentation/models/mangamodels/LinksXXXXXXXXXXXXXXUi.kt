package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.LinksXXXXXXXXXXXXXX

data class LinksXXXXXXXXXXXXXXUi(
    val related: String?,
    val self: String?
)

fun LinksXXXXXXXXXXXXXX.toUi() = LinksXXXXXXXXXXXXXXUi(
    related, self
)