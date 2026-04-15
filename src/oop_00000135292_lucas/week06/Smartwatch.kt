package oop_00000135292_lucas.week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {

    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("mencari perangkat hp di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("mengisi daya menggunakan charger magnetik 15W.")
    }
}