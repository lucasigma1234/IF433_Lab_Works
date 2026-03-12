package oop_00000135292_lucas.week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("Processing Rp$amount via Gopay Server")
    }
}
class CreditCard : PaymentMethod {
    override fun pay(amount: Double) {
        println("Contacting Bank for Rp$amount")
    }
}