package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Relationships
import com.google.gson.annotations.SerializedName

data class RelationshipsDto(
    @SerializedName("castings")
    val castings: CastingsDto?,
    @SerializedName("categories")
    val categories: CategoriesDto?,
    @SerializedName("chapters")
    val chapters: ChaptersDto?,
    @SerializedName("characters")
    val characters: CharactersDto?,
    @SerializedName("genres")
    val genres: GenresDto?,
    @SerializedName("installments")
    val installments: InstallmentsDto?,
    @SerializedName("mangaCharacters")
    val mangaCharacters: MangaCharactersDto?,
    @SerializedName("mangaStaff")
    val mangaStaff: MangaStaffDto?,
    @SerializedName("mappings")
    val mappings: MappingsDto?,
    @SerializedName("mediaRelationships")
    val mediaRelationships: MediaRelationshipsDto?,
    @SerializedName("productions")
    val productions: ProductionsDto?,
    @SerializedName("quotes")
    val quotes: QuotesDto?,
    @SerializedName("reviews")
    val reviews: ReviewsDto?,
    @SerializedName("staff")
    val staff: StaffDto?
)

fun RelationshipsDto.toDomain() = Relationships(
    castings?.toDomain(),
    categories?.toDomain(),
    chapters?.toDomain(),
    characters?.toDomain(),
    genres?.toDomain(),
    installments?.toDomain(),
    mangaCharacters?.toDomain(),
    mangaStaff?.toDomain(),
    mappings?.toDomain(),
    mediaRelationships?.toDomain(),
    productions?.toDomain(),
    quotes?.toDomain(),
    reviews?.toDomain(),
    staff?.toDomain(),
)