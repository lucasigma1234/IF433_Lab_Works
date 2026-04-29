package oop_00000135292_lucas.week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("Original Data: $numbers")
    println("\n=== HOF: FILTER ===")
    // filter() membuat list baru berisi elemen yang memenuhi kondisi (true) [cite: 78]
    val evens = numbers.filter { it % 2 == 0 }
    println("Evens only: $evens")
    println("\n=== HOF: MAP ===")
    // map() merubah bentuk/nilai data [cite: 85]
    val multiplied = evens.map { it * 10 }
    val asStrings = multiplied.map { "Rp ${it}k" }
    println("Multiplied: $multiplied")
    println("Formatted: $asStrings")

    // Menambah SortedByDescending dan forEach sesuai pesan commit Checkpoint 7
    println("\n=== HOF: SORT & FOREACH ===")
    val sortedData = numbers.sortedByDescending { it }
    sortedData.forEach { print("$it ") }
}