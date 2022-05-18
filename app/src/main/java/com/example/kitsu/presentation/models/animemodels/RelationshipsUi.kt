package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Relationships

data class RelationshipsUi(
    val animeCharacters: AnimeCharactersUi?,
    val animeProductions: AnimeProductionsUi,
    val animeStaff: AnimeStaffUi,
    val castings: CastingsUi,
    val categories: CategoriesUi,
    val characters: CharactersUi,
    val episodes: EpisodesUi,
    val genres: GenresUi,
    val installments: InstallmentsUi,
    val mappings: MappingsUi,
    val mediaRelationships: MediaRelationshipsUi,
    val productions: ProductionsUi,
    val quotes: QuotesUi,
    val reviews: ReviewsUi,
    val staff: StaffUi,
    val streamingLinks: StreamingLinksUi
)

fun Relationships.toUi() = RelationshipsUi(
    animeCharacters?.toUi(),
    animeProductions.toUi(),
    animeStaff.toUi(),
    castings.toUi(),
    categories.toUi(),
    characters.toUi(),
    episodes.toUi(),
    genres.toUi(),
    installments.toUi(),
    mappings.toUi(),
    mediaRelationships.toUi(),
    productions.toUi(),
    quotes.toUi(),
    reviews.toUi(),
    staff.toUi(),
    streamingLinks.toUi(),

    )