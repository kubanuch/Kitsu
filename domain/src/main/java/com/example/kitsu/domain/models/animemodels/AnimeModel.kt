package com.example.kitsu.domain.models.animemodels

data class AnimeModel(
    val attributes: Attributes,
    val id: String?,
    val links: Links,
    val relationships: Relationships,
    val type: String?
)