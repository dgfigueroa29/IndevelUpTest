package com.example.data.core

/**
 * Base Entity all DB entities should inherit from.
 */
abstract class BaseEntity(
    var created: Long = 0L,
    var updated: Long = 0L
)