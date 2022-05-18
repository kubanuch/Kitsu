package com.example.kitsu.presentation.models.genresmodels

import com.example.kitsu.base.BaseDiffModel
import com.example.kitsu.domain.models.genresmodels.GenresModels

data class GenresModelsUi(
    val links: LinksModelUi,
    val attributes: AttributesModelsUi,
    override val id: String,
    val type: String,
) : BaseDiffModel

fun GenresModels.toUi() = GenresModelsUi(
    links.toUi(),
    attributes.toUi(),
    id,
    type
)