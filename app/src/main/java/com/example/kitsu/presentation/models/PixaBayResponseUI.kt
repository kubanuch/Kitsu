package com.example.kitsu.presentation.models

import com.example.kitsu.domain.models.PixaBayResponse


data class PixaBayResponseUI(
    val id: Int,
    val totalHist: Int?,
    val hits: List<PixaBayModelUI>,
)

fun PixaBayResponse.toUI() = hits.let {
    PixaBayResponseUI(id, totalHist, it.map {
        it.toUI()
    })
}



