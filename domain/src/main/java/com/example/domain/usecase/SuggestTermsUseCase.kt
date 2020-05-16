package com.example.domain.usecase

import com.example.domain.core.BaseUseCase
import com.example.domain.repository.TermRepository
import kotlinx.coroutines.CoroutineScope

class SuggestTermsUseCase(scope: CoroutineScope, private val termRepository: TermRepository) :
    BaseUseCase<List<String>, Any?>(scope) {
    override suspend fun getData(param: Any?): List<String> = termRepository.getTerms()
}