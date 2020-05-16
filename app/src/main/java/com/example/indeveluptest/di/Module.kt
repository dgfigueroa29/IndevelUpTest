package com.example.indeveluptest.di

import com.example.indeveluptest.view.detail.DetailViewModel
import com.example.indeveluptest.view.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { MainViewModel(get(), get()) }
    viewModel { DetailViewModel() }
}