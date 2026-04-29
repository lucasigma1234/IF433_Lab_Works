package oop_00000135292_lucas.week09

data class TradeLog(
    val pair: String,
    val position: String, // LONG atau SHORT
    val leverage: Int,
    val roe: Double,      // Persentase profit/loss
    val status: String    // OPEN atau CLOSED
)