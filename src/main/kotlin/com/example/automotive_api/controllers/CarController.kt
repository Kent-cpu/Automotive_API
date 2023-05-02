package com.example.automotive_api.controllers

import com.example.automotive_api.models.Car
import com.example.automotive_api.services.CarService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("cars")
class CarController(private val carService: CarService) {
    @GetMapping("year")
    fun getCarsByYear(@RequestParam year: Int): ResponseEntity<List<Car>>? {
        return ResponseEntity.ok(carService.findByYear(year))
    }

    @GetMapping("make")
    fun getCarsByMake(@RequestParam make: String): ResponseEntity<List<Car>>? {
        return ResponseEntity.ok(carService.findByMake(make))
    }
}