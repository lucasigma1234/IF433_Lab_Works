package oop_00000135292_lucas.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {

    // === TESTING WATCH ===
    val myWatch = Smartwatch()
    myWatch.showTime()

    // === TESTING PHONE ===
    val myPhone = Smartphone()
    myPhone.turnOn()

    // === TESTING PAYMENT ===
    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    // === SMART HOME SYSTEM TEST ===
    println("\n=== SMART HOME TEST ===")

    val hub = SmartHomeHub()

    val lamp = SmartLamp("01", "Ruang Tamu")
    val speaker = SmartSpeaker("02", "Google Nest Dapur")
    val cctv = SmartCCTV("03", "Ezviz Garasi")

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    // aktifkan mode keamanan
    hub.activateSecurityMode()

    // matikan semua perangkat switchable
    hub.turnOffAllSwitches()
}