package com.example.kitsu.di

import com.example.kitsu.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {



    @Singleton
    private val retrofit = RetrofitClient()

    @Provides
    @Singleton
    fun providesApiService() = retrofit.providePixaBayApiService()

}