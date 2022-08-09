package com.example.dynamicrecyclerview.presentation.di

import com.example.dynamicrecyclerview.data.repository.LayoutRepositoryImpl
import com.example.dynamicrecyclerview.data.repository.datasource.LayoutDataSource
import com.example.dynamicrecyclerview.domain.repository.LayoutRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Singleton
    @Provides
    fun provideLayoutRepository(
        layoutDataSource: LayoutDataSource
    ): LayoutRepository {
        return LayoutRepositoryImpl(
            layoutDataSource
        )
    }
}