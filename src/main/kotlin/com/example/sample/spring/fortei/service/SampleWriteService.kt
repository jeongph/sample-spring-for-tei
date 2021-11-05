package com.example.sample.spring.fortei.service

import com.example.sample.spring.fortei.entity.SampleEntity
import com.example.sample.spring.fortei.repository.SampleRepository
import org.springframework.stereotype.Service

@Service
@Transactional(readOnly = false)
class SampleWriteService(
    private val sampleRepository: SampleRepository
) {
    fun create(input: SampleDto): SampleEntity {
        // Code
    }

    fun update(input: SampleDto): SampleEntity {
        // Code
    }
}