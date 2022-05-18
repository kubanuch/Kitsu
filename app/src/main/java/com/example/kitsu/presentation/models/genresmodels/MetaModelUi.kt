package com.example.kitsu.presentation.models.genresmodels

import com.example.kitsu.domain.models.genresmodels.MetaModel

data class MetaModelUi(
    val count: Int = 0
)

fun MetaModel.toUi() = MetaModelUi(
    count
)