package oop_00000135292_lucas.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 10.2))
    coinRepo.add(Coin("USDT", 1500.0))
    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("=== CRYPTO DASHBOARD API RESPONSE ===")
    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Coin: ${coin.name} | Balance: ${coin.balance}")
    }
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 0.05))
    txRepo.add(Transaction("TX002", 1.2))
    println("\n--- RECENT TRANSACTIONS ---")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id} | Amount: ${tx.amount}")
    }
    val searchBtc = coinRepo.find { it.name == "BTC" }
    println("\nSearch Result: ${searchBtc ?: "Not Found"}")
    println("\nSystem exit, and keep your logic immutable!") [cite: 348]
}