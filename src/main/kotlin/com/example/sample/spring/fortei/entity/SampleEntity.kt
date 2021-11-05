package com.example.sample.spring.fortei.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDate
import javax.persistence.*

@Entity(name = "samples")
@EntityListeners(AuditingEntityListener::class)
class SampleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var no = 0L

    var sample = ""

    @CreatedDate
    var createdAt = LocalDate.now()

    @LastModifiedDate
    var updatedAt = LocalDate.now()
}