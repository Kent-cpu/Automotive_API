package com.example.automotive_api.models

import jakarta.persistence.*

@Entity
@Table(name = "car")
class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(name = "make")
    var make: String? = null

    @Column(name = "model")
    var model: String? = null

    @Column(name = "year")
    var year: Int? = null

    @Column(name = "description")
    var description: String? = null

    @Column(name = "horsepower")
    var horsepower: Int? = null
}