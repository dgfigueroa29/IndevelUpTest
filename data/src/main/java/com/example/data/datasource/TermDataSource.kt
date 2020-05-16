package com.example.data.datasource

import com.example.data.entity.TermEntity

interface TermDataSource {
    suspend fun saveTerm(term: String): TermEntity
    suspend fun getTerms(): List<TermEntity>
}