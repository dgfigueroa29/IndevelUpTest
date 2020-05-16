package com.example.indeveluptest.view.main

import com.example.domain.core.BaseException
import com.example.domain.core.BaseStatusObserver
import com.example.domain.model.Result
import com.example.domain.usecase.SearchUseCase
import com.example.domain.usecase.SuggestTermsUseCase
import com.example.indeveluptest.core.BaseViewModel

class MainViewModel(
    private val suggestTermsUseCase: SuggestTermsUseCase,
    private val searchUseCase: SearchUseCase
) : BaseViewModel<MainViewStatus>() {
    var resultList: List<Result> = listOf()
    var termList: List<String> = listOf()

    override fun getInitialViewState(): MainViewStatus = MainViewStatus()

    fun suggest(term: String = "") {
        val mainViewStatus = getInitialViewState()
        BaseStatusObserver(resourceViewState, suggestTermsUseCase.execute(null), {
            termList = it ?: termList
            mainViewStatus.isReady = true
            mainViewStatus.termList = termList
            resourceViewState.value = mainViewStatus
        }, this::onError, this::onLoading)

        if (term.isNotEmpty()) {
            termList = listOf(term)
        }
    }

    fun search(term: String, isTest: Boolean = false) {
        val mainViewStatus = getInitialViewState()
        BaseStatusObserver(resourceViewState, searchUseCase.execute(term), {
            resultList = it ?: resultList
            mainViewStatus.isComplete = true
            mainViewStatus.resultList = resultList
            resourceViewState.value = mainViewStatus
        }, this::onError, this::onLoading)

        if (isTest) {
            val result = Result()
            result.term = term
            resultList = listOf(result)
        }
    }

    private fun onError(exception: BaseException?) {
        exception?.let {
            val mainViewStatus = getInitialViewState()
            mainViewStatus.isError = true
            mainViewStatus.errorMessage = it.message ?: ""
            resourceViewState.value = mainViewStatus
        }
    }

    private fun onLoading(progress: Int) {
        val mainViewStatus = getInitialViewState()
        mainViewStatus.isLoading = progress > 100
        resourceViewState.value = mainViewStatus
    }
}