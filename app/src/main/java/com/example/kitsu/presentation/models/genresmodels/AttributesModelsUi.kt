package com.example.kitsu.presentation.models.genresmodels

import com.example.kitsu.domain.models.genresmodels.AttributesModels

data class AttributesModelsUi(
    val createAt: String,
    val name: String,
    val description: String?,
    val slug: String,
    val updateAt: String,
)

fun AttributesModels.toUi() = AttributesModelsUi(
    createAt, name, description, slug, updateAt
)