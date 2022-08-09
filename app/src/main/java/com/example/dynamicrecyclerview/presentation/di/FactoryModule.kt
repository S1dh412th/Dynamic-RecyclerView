package com.example.dynamicrecyclerview.presentation.di

import android.app.Application
import com.example.dynamicrecyclerview.domain.usecase.GetLayoutUseCase
import com.example.dynamicrecyclerview.presentation.viewmodel.LayoutViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Singleton
    @Provides
    fun provideLayoutViewModelFactory(
        application: Application,
        getLayoutUseCase: GetLayoutUseCase
    ): LayoutViewModelFactory {
        return LayoutViewModelFactory(
            application,
            getLayoutUseCase
        )
    }
}