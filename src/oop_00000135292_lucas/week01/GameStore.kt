package oop_00000135292_lucas.week01

fun main(args: Array<String>) {

    val gameName = "Elden Ring"
    val price = 750000
    val isDiscount = true

    val finalPrice =
        if (isDiscount) price - 200000 else price

    println("Game: $gameName")
    println("Final Price: $finalPrice")
}