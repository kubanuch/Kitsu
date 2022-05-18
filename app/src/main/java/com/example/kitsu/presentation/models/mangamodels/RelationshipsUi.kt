package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.*

data class RelationshipsUi(
    val castings: CastingsUi?,
    val categories: CategoriesUi?,
    val chapters: ChaptersUi?,
    val characters: CharactersUi?,
    val genres: GenresUi?,
    val installments: InstallmentsUi?,
    val mangaCharacters: MangaCharactersUi?,
    val mangaStaff: MangaStaffUi?,
    val mappings: MappingsUi?,
    val mediaRelationships: MediaRelationshipsUi?,
    val productions: ProductionsUi?,
    val quotes: QuotesUi?,
    val reviews: ReviewsUi?,
    val staff: StaffUi?
)

fun Relationships.toUi() = RelationshipsUi(
    castings?.toUi(),
    categories?.toUi(),
    chapters?.toUi(),
    characters?.toUi(),
    genres?.toUi(),
    installments?.toUi(),
    mangaCharacters?.toUi(),
    mangaStaff?.toUi(),
    mappings?.toUi(),
    mediaRelationships?.toUi(),
    productions?.toUi(),
    quotes?.toUi(),
    reviews?.toUi(),
    staff?.toUi(),
)