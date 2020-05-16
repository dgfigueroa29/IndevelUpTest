package com.example.indeveluptest.view.detail

import com.example.indeveluptest.core.BaseViewModel

class DetailViewModel : BaseViewModel<DetailViewStatus>() {
    override fun getInitialViewState(): DetailViewStatus = DetailViewStatus()

    fun load(url: String) {
        resourceViewState.value = DetailViewStatus(url)
    }
}