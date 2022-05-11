package com.example.kitsu.domain.models

data class PixaBayResponse(
    val id: Int,
    val totalHist: Int?,
    val hits: List<PixaBayModel>,

    )


