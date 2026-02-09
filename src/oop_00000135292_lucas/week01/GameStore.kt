package oop_00000135292_lucas.week01

fun main(args: Array<String>) {

    var gameName: String = "Elden Ring"
    var price: Int = 750000
    var isDiscount: Boolean = true

    var finalPrice: Int

    if (isDiscount == true) {
        finalPrice = price - 200000
    } else {
        finalPrice = price
    }

    println("Game: " + gameName)
    println("Final Price: " + finalPrice)
}