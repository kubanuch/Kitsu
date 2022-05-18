package com.example.kitsu.data.remote.dtos.animemodels


import com.example.kitsu.domain.models.animemodels.Attributes
import com.google.gson.annotations.SerializedName

data class AttributesDto(
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: List<String>,
    @SerializedName("ageRating")
    val ageRating: String?,
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: String?,
    @SerializedName("averageRating")
    val averageRating: String?,
    @SerializedName("canonicalTitle")
    val canonicalTitle: String?,
    @SerializedName("coverImage")
    val coverImage: CoverImageDto?,
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int?,
    @SerializedName("createdAt")
    val createdAt: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("endDate")
    val endDate: String?,
    @SerializedName("episodeCount")
    val episodeCount: Int?,
    @SerializedName("episodeLength")
    val episodeLength: Int?,
    @SerializedName("favoritesCount")
    val favoritesCount: Int?,
    @SerializedName("nsfw")
    val nsfw: Boolean?,
    @SerializedName("popularityRank")
    val popularityRank: Int?,
    @SerializedName("posterImage")
    val posterImage: PosterImageDto,
    @SerializedName("ratingFrequencies")
    val ratingFrequencies: RatingFrequenciesDto,
    @SerializedName("ratingRank")
    val ratingRank: Int?,
    @SerializedName("showType")
    val showType: String?,
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
    val titles: TitlesDto,
    @SerializedName("totalLength")
    val totalLength: Int?,
    @SerializedName("updatedAt")
    val updatedAt: String?,
    @SerializedName("userCount")
    val userCount: Int?,
    @SerializedName("youtubeVideoId")
    val youtubeVideoId: String?
)

fun AttributesDto.toDomain() = Attributes(
    abbreviatedTitles,
    ageRating,
    ageRatingGuide,
    averageRating,
    canonicalTitle,
    coverImage?.toDomain(),
    coverImageTopOffset,
    createdAt,
    description,
    endDate,
    episodeCount,
    episodeLength,
    favoritesCount,
    nsfw,
    popularityRank,
    posterImage.toDomain(),
    ratingFrequencies.toDomain(),
    ratingRank,
    showType,
    slug,
    startDate,
    status,
    subtype,
    synopsis,
    tba,
    titles.toDomain(),
    totalLength,
    updatedAt,
    userCount,
    youtubeVideoId


)