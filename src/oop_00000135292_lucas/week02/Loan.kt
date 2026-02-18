package oop_00000135292_lucas.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- SISTEM PEMINJAMAN BUKU ---")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // Validasi sesuai modul
    if (duration < 0) {
        println("Durasi tidak valid, otomatis diset ke 1 hari.")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul Buku : ${loan.bookTitle}")
    println("Peminjam  : ${loan.borrower}")
    println("Durasi    : ${loan.loanDuration} hari")
    println("Denda     : Rp ${loan.calculateFine()}")
}
