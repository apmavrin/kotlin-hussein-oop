package com.car.maintain

//Data class - class with no methods to define object

data class Person(val name: String, val age: Int, val gender: String)

fun main() {

    val person = Person("Anton", 36, "Male")
    println("Person's name: ${person.name}")
    println("Person's age: ${person.age}")
    println("Person's gender: ${person.gender}")

}
