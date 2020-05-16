package com.example.data.datasource.remote

import com.example.data.datasource.SearchDataSource
import com.example.domain.model.Result

class RemoteSearchDataSource(private val api: AppApi) : SearchDataSource {
    override suspend fun searchByTerm(term: String): List<Result> = api.getResults(term).results
}