package com.example.sample.spring.fortei.controller

import com.example.sample.spring.fortei.service.SampleReadService
import com.example.sample.spring.fortei.service.SampleWriteService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/sample")
class SampleController(
    private val sampleReadService: SampleReadService,
    private val sampleWriteService: SampleWriteService
) {
    @PostMapping
    fun create(@RequestBody input: SampleDto) {
        //
    }

    @GetMapping("/{sampleNo}")
    fun index(@PathVariable sampleNo: Long){
        //
    }

    @PutMapping("/{sampleNo}")
    fun update(@PathVariable sampleNo: Long, @RequestBody input: SampleDto){
        //
    }
}
