package com.example.domain.repository

import com.example.domain.model.Result

interface SearchRepository {
    suspend fun searchByTerm(term: String): List<Result>
}