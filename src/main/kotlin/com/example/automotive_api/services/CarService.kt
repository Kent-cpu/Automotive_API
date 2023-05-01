package com.example.automotive_api.services

import com.example.automotive_api.models.Car
import com.example.automotive_api.models.Person
import com.example.automotive_api.repositories.CarRepository

class CarService(private val carRepository: CarRepository) {
    fun findByYear(year: Int): List<Car>? {
        return this.carRepository.findByYear(year)
    }
    fun findByMake(make: String): List<Car>? {
        return this.carRepository.findByMake(make)
    }
}