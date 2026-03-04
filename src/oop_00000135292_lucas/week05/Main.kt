package oop_00000135292_lucas.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Lucas", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Alya")
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)
    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("------------------------------")
    }
    println("\n=== TESTING MATH HELPER (OVERLOADING) ===")
    val math = MathHelper()
    val luasPersegi = math.hitungLuas(5)
    println("Luas Persegi (sisi 5)          : $luasPersegi")
    val luasPersegiPanjang = math.hitungLuas(10, 5)
    println("Luas Persegi Panjang (10x5)    : $luasPersegiPanjang")
    val luasLingkaran = math.hitungLuas(7.0)
    println("Luas Lingkaran (r 7.0)         : $luasLingkaran")
    println("\n=== SISTEM PEMBAYARAN E-COMMERCE ===")

    val myWallet = EWallet("Lucas Pay", 50000.0)
    val myCard = CreditCard("Lucas Visa", 100000.0)
    val listPembayaran: List<PaymentMethod> = listOf(myWallet, myCard)

    for (metode in listPembayaran) {
        println("Memproses pembayaran untuk: ${metode.accountName}")
        metode.processPayment(75000.0)
        if (metode is EWallet) {
            println("-> Mendeteksi E-Wallet, mencoba pemulihan saldo...")
            metode.topUp(50000.0)
            println("-> Mencoba pembayaran ulang...")
            metode.processPayment(75000.0)
        }
        println("------------------------------")
    }
}