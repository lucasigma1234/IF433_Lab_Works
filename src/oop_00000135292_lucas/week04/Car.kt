package oop_00000135292_lucas.week04

class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand terbuka.")
    }
}