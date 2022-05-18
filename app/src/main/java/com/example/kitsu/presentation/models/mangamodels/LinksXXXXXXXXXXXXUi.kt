package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.LinksXXXXXXXXXXXX

data class LinksXXXXXXXXXXXXUi(
    val related: String?,
    val self: String?
)

fun LinksXXXXXXXXXXXX.toUi() = LinksXXXXXXXXXXXXUi(
    related, self
)