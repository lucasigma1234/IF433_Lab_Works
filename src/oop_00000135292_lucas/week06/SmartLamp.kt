package oop_00000135292_lucas.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu pintar $name dinyalakan.")
    }
    override fun turnOff() {
        println("Lampu pintar $name dimatikan.")
    }
}