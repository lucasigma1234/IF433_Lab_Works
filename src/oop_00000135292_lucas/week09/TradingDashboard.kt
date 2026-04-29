package oop_00000135292_lucas.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 50, 120.0, "OPEN"),
        TradeLog("SOLUSDT", "LONG", 10, -2.5, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, 45.0, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10, -10.0, "CLOSED")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }
    val worstPerformersString = losingTrades
        .sortedBy { it.roe } // Urutan dari minus paling besar
        .map { "LOSS [${it.pair} ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }
    val uniquePairs = tradeHistory.map { it.pair }.toSet()
    println("=== CRYPTO TRADING DASHBOARD ===")
    println("--- TOP PERFORMERS ---")
    topPerformersString.forEach { println(it) }
    println("\n--- WORST PERFORMERS ---")
    worstPerformersString.forEach { println(it) }
    println("\nUnique Pairs Traded: $uniquePairs")
    println("\nPipeline verification completed. No OPEN status included in analysis.")
} // Tutup fun main