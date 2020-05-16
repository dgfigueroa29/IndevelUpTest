package com.example.data.datasource.remote

import com.example.domain.model.Result

data class ResultResponseDto(val resultCount: Int = 20, val results: List<Result>)