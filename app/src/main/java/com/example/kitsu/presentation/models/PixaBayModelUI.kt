package com.example.kitsu.presentation.models

import com.example.kitsu.base.BaseDiffModel
import com.example.kitsu.domain.models.PixaBayModel


data class PixaBayModelUI(
    override var id: Int,
    val pageURL: String? = null,

    val type: String? = null,

    val tags: String? = null,

    val previewURL: String? = null,

    val previewWidth: Int? = null,

    val previewHeight: Int? = null,

    val webformatURL: String? = null,

    val webformatWidth: Int? = null,

    val webformatHeight: Int? = null,

    val largeImageURL: String? = null,

    val imageWidth: Int? = null,

    val imageHeight: Int? = null,

    val imageSize: Int? = null,

    val views: Int? = null,

    val downloads: Int? = null,

    val collections: Int? = null,

    val likes: Int? = null,

    val comments: Int? = null,

    val userId: Int? = null,

    val user: String? = null,

    val userImageURL: String? = null
) : BaseDiffModel

fun PixaBayModel.toUI() = PixaBayModelUI(
    id,
    pageURL,
    type,
    tags,
    previewURL,
    previewWidth,
    previewHeight,
    webformatURL,
    webformatWidth,
    webformatHeight,
    largeImageURL,
    imageWidth,
    imageHeight,
    imageSize,
    views,
    downloads,
    collections,
    likes,
    comments,
    userId,
    user,
    userImageURL
)