package oop_00000135292_lucas.week04

open class Vehicle(val brand: String) {

    open fun honk() {
        println("$brand berbunyi: Tin Tin!")
    }

    open fun accelerate() {
        println("$brand sedang berakselerasi.")
    }
}