package oop_00000135292_lucas.week01

fun main(args: Array<String>) {

    val gameName = "Elden Ring"
    val price = 750000
    val isDiscount = true

    val finalPrice: Int

    if (isDiscount) {
        finalPrice = price - 200000
    } else {
        finalPrice = price
    }

    println("Game: $gameName")
    println("Final Price: $finalPrice")
}