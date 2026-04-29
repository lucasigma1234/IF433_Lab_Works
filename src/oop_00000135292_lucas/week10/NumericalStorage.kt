package oop_00000135292_lucas.week10

// Menggunakan <T: Number> untuk memastikan hanya tipe angka yang diperbolehkan [cite: 265, 268]
class MathBox<T: Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble() [cite: 269]
    }
    // Menggunakan where clause agar tipe T harus bisa dibandingkan (Comparable) [cite: 276, 277]
    fun <T> getMax(a: T, b: T): T where T: Comparable<T> {
        return if (a > b) a else b [cite: 278]
    }
}