package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Attributes

data class AttributesUi(
    val abbreviatedTitles: List<String>?,
    val ageRating: String?,
    val ageRatingGuide: String?,
    val averageRating: String?,
    val canonicalTitle: String?,
    val coverImage: CoverImageUi,
    val coverImageTopOffset: Int?,
    val createdAt: String?,
    val description: String?,
    val endDate: String?,
    val episodeCount: Int?,
    val episodeLength: Int?,
    val favoritesCount: Int?,
    val nsfw: Boolean?,
    val popularityRank: Int?,
    val posterImage: PosterImageUi,
    val ratingFrequencies: RatingFrequenciesUi,
    val ratingRank: Int?,
    val showType: String?,
    val slug: String?,
    val startDate: String?,
    val status: String?,
    val subtype: String?,
    val synopsis: String?,
    val tba: String?,
    val titles: TitlesUi,
    val totalLength: Int?,
    val updatedAt: String?,
    val userCount: Int?,
    val youtubeVideoId: String?
)

fun Attributes.toUi() = coverImage?.toUi()?.let {
    AttributesUi(
        abbreviatedTitles,
        ageRating,
        ageRatingGuide,
        averageRating,
        canonicalTitle,
        it,
        coverImageTopOffset,
        createdAt,
        description,
        endDate,
        episodeCount,
        episodeLength,
        favoritesCount,
        nsfw,
        popularityRank,
        posterImage.toUi(),
        ratingFrequencies.toUi(),
        ratingRank,
        showType,
        slug,
        startDate,
        status,
        subtype,
        synopsis,
        tba,
        titles.toUi(),
        totalLength,
        updatedAt,
        userCount,
        youtubeVideoId


    )
}