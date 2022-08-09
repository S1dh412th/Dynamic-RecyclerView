package com.example.dynamicrecyclerview.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dynamicrecyclerview.domain.usecase.GetLayoutUseCase

class LayoutViewModelFactory(
    private val application: Application,
    private val getLayoutUseCase: GetLayoutUseCase
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LayoutViewModel(
            application,
            getLayoutUseCase
        ) as T
    }

}