package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.MetaX

data class MetaXUi(
    val count: Int?
)

fun MetaX.toUi() = MetaXUi(
    count
)