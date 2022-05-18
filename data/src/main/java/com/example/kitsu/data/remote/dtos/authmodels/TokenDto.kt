package com.example.kitsu.data.remote.dtos.authmodels

import com.example.kitsu.domain.models.authentication.TokenModel
import com.google.gson.annotations.SerializedName

data class TokenDto(
    @SerializedName("access_token")
    val accessToken: String,
    @SerializedName("created_at")
    val createdAt: Long,
    @SerializedName("expires_in")
    val expiresIn: Int,
    @SerializedName("refresh_token")
    val refreshToken: String,
    @SerializedName("scope")
    val scope: String,
    @SerializedName("token_type")
    val tokenType: String,
)

fun TokenDto.toDomain() = TokenModel(
    accessToken,
    createdAt,
    expiresIn,
    refreshToken,
    scope,
    tokenType
)
