package com.example.domain.core

import java.io.IOException

data class BaseException(val error: BaseError) : IOException()