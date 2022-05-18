package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Relationships
import com.google.gson.annotations.SerializedName

data class RelationshipsDto(
    @SerializedName("animeCharacters")
    val animeCharacters: AnimeCharactersDto?,
    @SerializedName("animeProductions")
    val animeProductions: AnimeProductionsDto,
    @SerializedName("animeStaff")
    val animeStaff: AnimeStaffDto,
    @SerializedName("castings")
    val castings: CastingsDto,
    @SerializedName("categories")
    val categories: CategoriesDto,
    @SerializedName("characters")
    val characters: CharactersDto,
    @SerializedName("episodes")
    val episodes: EpisodesDto,
    @SerializedName("genres")
    val genres: GenresDto,
    @SerializedName("installments")
    val installments: InstallmentsDto,
    @SerializedName("mappings")
    val mappings: MappingsDto,
    @SerializedName("mediaRelationships")
    val mediaRelationships: MediaRelationshipsDto,
    @SerializedName("productions")
    val productions: ProductionsDto,
    @SerializedName("quotes")
    val quotes: QuotesDto,
    @SerializedName("reviews")
    val reviews: ReviewsDto,
    @SerializedName("staff")
    val staff: StaffDto,
    @SerializedName("streamingLinks")
    val streamingLinks: StreamingLinksDto
)

fun RelationshipsDto.toDomain() =
    Relationships(
        animeCharacters?.toDomain(),
        animeProductions.toDomain(),
        animeStaff.toDomain(),
        castings.toDomain(),
        categories.toDomain(),
        characters.toDomain(),
        episodes.toDomain(),
        genres.toDomain(),
        installments.toDomain(),
        mappings.toDomain(),
        mediaRelationships.toDomain(),
        productions.toDomain(),
        quotes.toDomain(),
        reviews.toDomain(),
        staff.toDomain(),
        streamingLinks.toDomain(),
        )

