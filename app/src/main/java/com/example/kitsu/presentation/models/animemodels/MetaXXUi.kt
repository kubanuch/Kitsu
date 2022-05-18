package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.MetaXX

data class MetaXXUi(
    val count: Int
)

fun MetaXX.toUi() = MetaXXUi(
    count
)