package com.example.springnativedemo

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CustomerRepository: JpaRepository<Customer, String> {

    fun findByName(name: String): Optional<Customer>
}