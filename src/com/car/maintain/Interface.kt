package com.car.maintain

interface CreditCard{
    val cardNumber: String

    fun score(age: Int)

}

class MasterCard(override val cardNumber: String) : CreditCard{

    override fun score(age: Int) {
        if(age > 50) {
            println("Negative")
        } else {
            println("Positive")
        }
    }

}

class VisaCard(override val cardNumber: String) : CreditCard{

    override fun score(age: Int) {
        if(age > 60) {
            println("Negative")
        } else {
            println("Positive")
        }
    }

}

//delegation

class PayPal(client:CreditCard): CreditCard by client{

    fun print(){
        println(this.cardNumber)
    }

}

fun main() {

    val visa = VisaCard("5353 3535 3535 3535")
    visa.score(56)

    val payPal = PayPal(visa)
    println("cardNumber Paypal: ${payPal.cardNumber}")
    payPal.print()
}