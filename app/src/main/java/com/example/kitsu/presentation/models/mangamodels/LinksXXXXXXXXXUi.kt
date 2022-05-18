package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.LinksXXXXXXXXX

data class LinksXXXXXXXXXUi(
    val related: String?,
    val self: String?
)

fun LinksXXXXXXXXX.toUi() = LinksXXXXXXXXXUi(
    related, self
)