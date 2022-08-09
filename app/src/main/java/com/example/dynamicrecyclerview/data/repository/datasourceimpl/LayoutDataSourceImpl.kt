package com.example.dynamicrecyclerview.data.repository.datasourceimpl

import com.example.dynamicrecyclerview.data.model.DynamicLayout
import com.example.dynamicrecyclerview.data.repository.datasource.LayoutDataSource
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class LayoutDataSourceImpl: LayoutDataSource {
    override fun getLayout(): Flow<List<DynamicLayout>> = flow {
        val layoutString = this::class.java.classLoader?.getResource("layout.json")?.readText()
        val layout: List<DynamicLayout> = Gson().fromJson(layoutString, object : TypeToken<List<DynamicLayout>>() {}.type)
        emit(layout)
    }
}