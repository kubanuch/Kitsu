package com.example.kitsu.data.remote.dtos.mangamodels


import com.example.kitsu.domain.models.mangamodels.Attributes
import com.google.gson.annotations.SerializedName

data class AttributesDto(
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: List<String>?,
    @SerializedName("ageRating")
    val ageRating: String?,
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: String?,
    @SerializedName("averageRating")
    val averageRating: String?,
    @SerializedName("canonicalTitle")
    val canonicalTitle: String?,
    @SerializedName("chapterCount")
    val chapterCount: Int?,
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int?,
    @SerializedName("createdAt")
    val createdAt: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("endDate")
    val endDate: String?,
    @SerializedName("favoritesCount")
    val favoritesCount: Int?,
    @SerializedName("mangaType")
    val mangaType: String?,
    @SerializedName("popularityRank")
    val popularityRank: Int?,
    @SerializedName("posterImage")
    val posterImage: PosterImageDto?,
    @SerializedName("ratingFrequencies")
    val ratingFrequencies: RatingFrequenciesDto?,
    @SerializedName("ratingRank")
    val ratingRank: Int?,
    @SerializedName("serialization")
    val serialization: String?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("startDate")
    val startDate: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("subtype")
    val subtype: String?,
    @SerializedName("synopsis")
    val synopsis: String?,
    @SerializedName("tba")
    val tba: String?,
    @SerializedName("titles")
    val titles: TitlesDto?,
    @SerializedName("updatedAt")
    val updatedAt: String?,
    @SerializedName("userCount")
    val userCount: Int?,
    @SerializedName("volumeCount")
    val volumeCount: Int?
)

fun AttributesDto.toDomain() = Attributes(
    abbreviatedTitles,
    ageRating,
    ageRatingGuide,
    averageRating,
    canonicalTitle,
    chapterCount,
    coverImageTopOffset,
    createdAt,
    description,
    endDate,
    favoritesCount,
    mangaType,
    popularityRank,
    posterImage?.toDomain(),
    ratingFrequencies?.toDomain(),
    ratingRank,
    serialization,
    slug,
    startDate,
    status,
    subtype,
    synopsis,
    tba,
    titles?.toDomain(),
    updatedAt, userCount, volumeCount
)