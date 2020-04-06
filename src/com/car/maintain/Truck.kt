package com.car.maintain

class Truck: ClassConstructor {

    var truckType: String? = null

    constructor(type: String, model: Int, price: Double, odometer: Int, owner: String, truckType: String):
            super(type, model, price, odometer, owner){

        this.truckType = truckType
    }

    override fun getCarPrice(): Double {
        return this.getPrice()!! - (this.odometer!!.toDouble()*0.3)
    }

}

//Extension. This allowed. Super is not allowed

fun Truck.getTruckPrice(): Double {
    return this.getCarPrice()
}

fun main() {

    val truck = Truck("Porter", 12, 5000.00,3000,"Anton", "Van")
    println(truck.owner)
    println(truck.getCarPrice())
    truck.getTruckPrice()

}
//private - no access to variable
//protected - access, but only inside sub-class declaration. From instance - no access.