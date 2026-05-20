package oop_00000135292_lucas.week10

fun main() {
    println("=== CRYPTO WALLET DASHBOARD ===")
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.25))
    coinRepo.add(Coin("ETH", 14.8))
    coinRepo.add(Coin("USDT", 500.0))
    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Status Response: ${response.status}")
    println("--- Coin List ---")
    response.data.forEach { coin ->
        println("Koin: ${coin.name} | Saldo: ${coin.balance}")
    }
    println("\n--------------------------------")
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-001", 0.05))
    txRepo.add(Transaction("TX-002", 2.5))
    txRepo.add(Transaction("TX-003", 150.0))
    val txResponse = ApiResponse("200 OK", txRepo.getAll())
    println("Status Response Transaksi: ${txResponse.status}")
    println("--- Transaction History ---")
    txResponse.data.forEach { tx ->
        println("ID Transaksi: ${tx.id} | Jumlah: ${tx.amount}")
    }
    println("\n--------------------------------")
    println("=== MENGUJI FITUR SEARCH ===")
    val searchResult = coinRepo.searchByName("BTC")
    println("Hasil pencarian koin dengan query 'BTC':")
    searchResult.forEach { coin ->
        println("Ditemukan -> Koin: ${coin.name}, Saldo: ${coin.balance}")
    }
}