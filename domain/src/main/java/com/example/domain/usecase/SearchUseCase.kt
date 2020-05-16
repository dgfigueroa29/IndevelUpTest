package com.example.domain.usecase

import com.example.domain.core.BaseUseCase
import com.example.domain.model.Result
import com.example.domain.repository.SearchRepository
import kotlinx.coroutines.CoroutineScope

class SearchUseCase(scope: CoroutineScope, private val searchRepository: SearchRepository) :
    BaseUseCase<List<Result>, String>(scope) {
    override suspend fun getData(param: String): List<Result> = searchRepository.searchByTerm(param)
}