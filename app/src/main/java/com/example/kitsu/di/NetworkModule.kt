package com.example.kitsu.di

import com.example.kitsu.data.remote.network.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun providesAnimeApiService(retrofitClient: RetrofitClient) =
        retrofitClient.provideAnimeApiService()


    @Provides
    @Singleton
    fun providesMangaApiService(retrofitClient: RetrofitClient) =
        retrofitClient.provideMangaApiService()

    @Provides
    @Singleton
    fun providesAuthentication(retrofitClient: RetrofitClient.AuthenticationClient) =
        retrofitClient.provideAuthenticationApiService()

    @Provides
    @Singleton
    fun providesGenresApiService(retrofitClient: RetrofitClient) =
        retrofitClient.provideGenresApiService()
}