package com.example.kitsu.di

import com.example.kitsu.data.repositories.PixaBayRepositoryImpl
import com.example.kitsu.domain.repositories.PixaBayRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun providePixaBayRepository(repositoryImpl: PixaBayRepositoryImpl): PixaBayRepository
}
