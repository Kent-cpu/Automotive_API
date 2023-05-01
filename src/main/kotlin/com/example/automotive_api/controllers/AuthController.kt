package com.example.automotive_api.controllers

import com.example.automotive_api.dtos.RegisterDTO
import com.example.automotive_api.models.Person
import com.example.automotive_api.services.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class AuthController(private val userService: UserService) {
    @PostMapping("register")
    fun register(@RequestBody body: RegisterDTO): ResponseEntity<Person> {
        val person = Person()
        person.name = body.name
        person.email = body.email
        person.password = body.password

        return ResponseEntity.ok(this.userService.save(person))
    }
}