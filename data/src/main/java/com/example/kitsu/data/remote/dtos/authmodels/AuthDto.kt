package com.example.kitsu.data.remote.dtos.authmodels

import com.google.gson.annotations.SerializedName

data class AuthDto(
    @SerializedName("grant_type")
    val granType: String = "password",
    @SerializedName("username")
    val username: String,
    @SerializedName("password")
    val password: String
)