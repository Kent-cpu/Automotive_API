package com.example.automotive_api.controllers

import com.example.automotive_api.models.Car
import com.example.automotive_api.repositories.CarRepository
import org.apache.coyote.Response
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("cars")
class CarController(private val carRepository: CarRepository) {

    @GetMapping("year")
    fun getCarsByYear(@RequestParam year: Int): ResponseEntity<List<Car>>? {
        return ResponseEntity.ok(carRepository.findByYear(year))
    }

    @GetMapping("make")
    fun getCarsByMake(@RequestParam make: String): ResponseEntity<List<Car>>? {
        return ResponseEntity.ok(carRepository.findByMake(make))
    }
}