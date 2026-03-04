package oop_00000135292_lucas.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran E-Wallet sebesar $amount berhasil. Sisa saldo: $balance")
        } else {
            println("[$accountName] Gagal: Saldo tidak cukup (Saldo: $balance, Tagihan: $amount)")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Berhasil Top Up sebesar $amount. Saldo sekarang: $balance")
    }
}