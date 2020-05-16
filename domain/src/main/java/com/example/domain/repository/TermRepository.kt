package com.example.domain.repository

interface TermRepository {
    suspend fun getTerms(): List<String>
}