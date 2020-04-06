package com.car.maintain

import java.util.*

//open class to be able to inherit it

open class ClassConstructor() {
    var type: String? = null
    var model: Int? = null
    private var price: Double? = null //no one will inherit it or access. Private!
    var odometer: Int? = 0
    var owner: String? = null

    constructor(type: String, model: Int, price: Double, odometer: Int, owner: String):this(){
        this.type = type
        this.model = model
        this.price = price
        this.odometer = odometer
        this.owner = owner
    }

    open fun getCarPrice(): Double {
        return this.price!! - (this.odometer!!.toDouble()*0.5)
    }

    fun getPrice(): Double? {
        return this.price
    }
}

fun main() {

    val car = ClassConstructor("BMW", 2015, 1000.00, 25000, "Anton")
    println(car.type)
    println(car.owner)

    val car2 = ClassConstructor("Nissan", 2018, 1200.00, 1000, "Anya")
    println(car2.type)
    println(car2.owner)
    println("${car2.getCarPrice()} EUR")
}
