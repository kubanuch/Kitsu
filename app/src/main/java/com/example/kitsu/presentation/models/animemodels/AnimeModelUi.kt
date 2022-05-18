package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.base.BaseDiffModel
import com.example.kitsu.domain.models.animemodels.AnimeModel

data class AnimeModelUi(
    val attributes: AttributesUi?,
    override val id: String?,
    val links: LinksUi,
    val relationships: RelationshipsUi,
    val type: String?
) : BaseDiffModel


fun AnimeModel.toUi() = AnimeModelUi(
    attributes.toUi(),
    id,
    links.toUi(),
    relationships.toUi(),
    type
)