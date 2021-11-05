package com.example.sample.spring.fortei.service

import com.example.sample.spring.fortei.repository.SampleRepository
import org.springframework.stereotype.Service

@Service
@Transactional(readOnly = true)
class SampleReadService(
    private val sampleRepository: SampleRepository
) {
    fun getByNo(sampleNo: Long): SampleDto {
        //
    }
}