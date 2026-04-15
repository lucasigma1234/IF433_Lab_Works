package oop_00000135292_lucas.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi invalid: Harga belum diset"
    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone", 1500000, UserProfile("Andi", null), "Laptop", 4500000.0
    )

    for (item in mixedData) {
        val text = item as? String
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast + fallback: $safeString")

    println("\n=== TEST REQUIRE NOT NULL (REPLACEMENT FOR !!) ===")

    val apiResponse: Map<String, String?> = mapOf(
        "status" to "200",
        "token" to null
    )

    try {
        val token = requireNotNull(apiResponse["token"]) {
            "CRITICAL EXCEPTION: Token otentikasi tidak ditemukan dari server"
        }
        println("Token diterima: $token")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
    println("\n=== TEST JAVA INTEROP ===")
    val javaResponse = LegacyJavaAPI.fetchServerStatus()
    val statusLength = javaResponse!!.length
    println("status dari jawa: $javaResponse(Length: $statusLength) ")
}