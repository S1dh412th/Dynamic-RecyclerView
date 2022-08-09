package com.example.dynamicrecyclerview.presentation.di

import com.example.dynamicrecyclerview.domain.repository.LayoutRepository
import com.example.dynamicrecyclerview.domain.usecase.GetLayoutUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Singleton
    @Provides
    fun provideGetLayoutUseCase(
        layoutRepository: LayoutRepository
    ): GetLayoutUseCase {
        return GetLayoutUseCase(layoutRepository)
    }
}