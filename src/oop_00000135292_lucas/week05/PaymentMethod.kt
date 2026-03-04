package oop_00000135292_lucas.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}