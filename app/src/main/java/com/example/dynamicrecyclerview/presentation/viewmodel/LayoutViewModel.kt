package com.example.dynamicrecyclerview.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.liveData
import com.example.dynamicrecyclerview.domain.usecase.GetLayoutUseCase

class LayoutViewModel(
    private val app: Application,
    private val getLayoutUseCase: GetLayoutUseCase
) : AndroidViewModel(app) {

    fun getLayout() = liveData {
        getLayoutUseCase.execute().collect {
            emit(it)
        }
    }

}