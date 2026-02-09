package oop_00000135292_lucas.week01

fun main() {
    val gameName = "Elden Ring"
    val price = 750000
    val isDiscount = true

    val finalPrice = calculateFinalPrice(price, isDiscount)

    println("Game: $gameName")
    println("Final Price: $finalPrice")
}

fun calculateFinalPrice(price: Int, isDiscount: Boolean) =
    if (isDiscount) price - 200000 else price