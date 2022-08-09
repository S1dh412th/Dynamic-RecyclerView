package com.example.dynamicrecyclerview.data.repository

import com.example.dynamicrecyclerview.data.model.DynamicLayout
import com.example.dynamicrecyclerview.data.repository.datasource.LayoutDataSource
import com.example.dynamicrecyclerview.domain.repository.LayoutRepository
import kotlinx.coroutines.flow.Flow

class LayoutRepositoryImpl(
    private val layoutDataSource: LayoutDataSource
): LayoutRepository {
    override fun getLayout(): Flow<List<DynamicLayout>> {
        return layoutDataSource.getLayout()
    }
}