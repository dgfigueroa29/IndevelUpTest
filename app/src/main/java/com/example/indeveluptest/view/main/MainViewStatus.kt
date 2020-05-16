package com.example.indeveluptest.view.main

import com.example.domain.model.Result
import com.example.indeveluptest.core.BaseViewStatus

class MainViewStatus(
    var resultList: List<Result> = listOf(),
    var termList: List<String> = listOf()
) : BaseViewStatus()