package com.example.data.datasource.local

import com.example.data.datasource.TermDataSource
import com.example.data.datasource.local.db.IndevelUpTestDatabase
import com.example.data.entity.TermEntity

class LocalTermDataSource(private val database: IndevelUpTestDatabase) : TermDataSource {
    override suspend fun saveTerm(term: String): TermEntity {
        val entity = TermEntity()
        entity.text = term
        database.termDao().insert(entity)
        return entity
    }

    override suspend fun getTerms(): List<TermEntity> = database.termDao().getAll()
}