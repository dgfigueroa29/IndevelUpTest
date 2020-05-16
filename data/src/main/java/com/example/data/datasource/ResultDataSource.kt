package com.example.data.datasource

import com.example.data.entity.ResultEntity

interface ResultDataSource {
    suspend fun saveResult(resultEntity: ResultEntity)
    suspend fun getResultsByTerm(term: String): List<ResultEntity>
}