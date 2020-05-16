package com.example.data.mapper

import com.example.data.entity.TermEntity
import com.example.domain.core.BaseMapper

class TermEntityToString : BaseMapper<TermEntity, String>() {
    override fun map(input: TermEntity): String = input.text
}