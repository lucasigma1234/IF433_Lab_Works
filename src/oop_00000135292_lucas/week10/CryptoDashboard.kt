package oop_00000135292_lucas.week10

fun main() {
    println("=== CRYPTO WALLET DASHBOARD ===")
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.25))
    coinRepo.add(Coin("ETH", 14.8))
    coinRepo.add(Coin("USDT", 500.0))
    val response = ApiResponse("200 OK", coinRepo.getAll())
}