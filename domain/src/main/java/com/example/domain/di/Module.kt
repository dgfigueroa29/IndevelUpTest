package com.example.domain.di

import com.example.domain.usecase.SearchUseCase
import com.example.domain.usecase.SuggestTermsUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

val domainModule = module {
    factory { SuggestTermsUseCase(get(), get()) }
    factory { SearchUseCase(get(), get()) }

    single { CoroutineScope(Dispatchers.IO) }
}