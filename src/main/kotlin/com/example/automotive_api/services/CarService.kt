package com.example.automotive_api.services

import com.example.automotive_api.models.Car
import com.example.automotive_api.repositories.CarRepository
import org.springframework.stereotype.Service

@Service
class CarService(private val carRepository: CarRepository) {
    fun findByYear(year: Int): List<Car>? = this.carRepository.findByYear(year)
    fun findByMake(make: String): List<Car>? = this.carRepository.findByMake(make)
}