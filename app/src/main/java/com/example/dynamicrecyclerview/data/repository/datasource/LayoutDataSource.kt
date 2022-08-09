package com.example.dynamicrecyclerview.data.repository.datasource

import com.example.dynamicrecyclerview.data.model.DynamicLayout
import kotlinx.coroutines.flow.Flow

interface LayoutDataSource {
    fun getLayout(): Flow<List<DynamicLayout>>
}