package com.example.dynamicrecyclerview.domain.usecase

import com.example.dynamicrecyclerview.data.model.DynamicLayout
import com.example.dynamicrecyclerview.domain.repository.LayoutRepository
import kotlinx.coroutines.flow.Flow

class GetLayoutUseCase(private val layoutRepository: LayoutRepository) {

    fun execute(): Flow<List<DynamicLayout>> {
        return layoutRepository.getLayout()
    }

}