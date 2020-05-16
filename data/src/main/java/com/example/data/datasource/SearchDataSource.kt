package com.example.data.datasource

import com.example.domain.model.Result

interface SearchDataSource {
    suspend fun searchByTerm(term: String): List<Result>
}