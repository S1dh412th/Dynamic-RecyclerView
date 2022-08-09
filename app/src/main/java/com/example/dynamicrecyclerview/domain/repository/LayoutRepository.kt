package com.example.dynamicrecyclerview.domain.repository

import android.content.Context
import com.example.dynamicrecyclerview.data.model.DynamicLayout
import kotlinx.coroutines.flow.Flow

interface LayoutRepository {

    fun getLayout(): Flow<List<DynamicLayout>>
}