package com.example.kitsu.data.repositories

import com.example.kitsu.data.remote.apiservices.PixaBayApiService
import com.example.kitsu.data.remote.dtos.toDomain
import com.example.kitsu.data.repositories.base.BaseRepository
import com.example.kitsu.domain.repositories.PixaBayRepository
import javax.inject.Inject

class PixaBayRepositoryImpl @Inject constructor(
    private val service: PixaBayApiService
) :
    BaseRepository(), PixaBayRepository {

    override fun fetchPixabay() = doRequest {
        service.fetchPixabay().toDomain()
    }
}