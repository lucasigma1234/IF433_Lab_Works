package oop_00000135292_lucas.week04

fun main() {

    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("Tesla", 4, 85)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()

    println("\n--- Testing Employee Hierarchy ---")

    val manager = Manager("Budi", 10000000)
    val developer = Developer("Andi", 8000000, "Kotlin")

    manager.work()
    println("Bonus Manager: ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: ${developer.calculateBonus()}")
}