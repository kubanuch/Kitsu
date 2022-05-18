package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Meta

data class MetaUi(
    val dimensions: DimensionsUi?
)
fun Meta.toUi()= MetaUi(
    dimensions.toUi()
)