package com.example.data.repository

import com.example.data.datasource.TermDataSource
import com.example.data.mapper.TermEntityToString
import com.example.domain.repository.TermRepository

class TermRepositoryImpl(
    private val termDataSource: TermDataSource,
    private val termEntityToString: TermEntityToString
) : TermRepository {
    override suspend fun getTerms(): List<String> =
        termEntityToString.mapAll(termDataSource.getTerms())
}