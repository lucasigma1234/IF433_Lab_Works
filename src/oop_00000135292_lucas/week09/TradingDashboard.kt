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