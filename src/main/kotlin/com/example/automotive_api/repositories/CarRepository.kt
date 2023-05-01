package com.example.automotive_api.repositories

import com.example.automotive_api.models.Car
import org.springframework.data.jpa.repository.JpaRepository

interface CarRepository: JpaRepository<Car, Int> {
    fun findByYear(year: Int): List<Car>?
    fun findByMake(make: String): List<Car>?
}