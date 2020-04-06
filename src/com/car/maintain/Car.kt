package com.car.maintain

import java.util.*

class Car(val type: String, model: Int, val price: Double,
          val odometer: Int, val owner: String ){

    init {
        println("Object class is created")
    }

    fun getCarPrice(): Double {
        return price - (odometer.toDouble()*0.5)
    }
}

fun main() {
/*
    val car = Car("BMW", 2015, 1000.00, 25000, "Anton")
    println(car.type)
    println(car.owner)

    val car2 = Car("Nissan", 2018, 1200.00, 1000, "Anya")
    println(car2.type)
    println(car2.owner)
    println("${car2.getCarPrice()} EUR")

    list of Cars
*/
    val listOfCars = LinkedList<Car>()
    listOfCars.add(Car("Nissan", 2018, 1200.00, 1000, "Anya"))
    listOfCars.add(Car("BMW", 2015, 15000.00, 25000, "Anton"))

    for(car in listOfCars) {
        println("----------")
        println(car.owner)
        println(car.getCarPrice())
    }
}