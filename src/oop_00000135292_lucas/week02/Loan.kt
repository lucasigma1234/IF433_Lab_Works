package oop_00000135292_lucas.week02

import java.util.Scanner

class loan (var booktitle: String, var borrower: String, var loanDuration: Int){
    init {
        loanDuration = 1;
    }
    fun calculateFine(): Int{
        var totalDenda: Int
        if (loanDuration >= 3){
            totalDenda = (loanDuration - 3) * 2000
        } else {
            totalDenda = loanDuration - 3
        }
        return totalDenda
    }
}
fun main(){
    var pinjem = loan("", "", 1,)
    val scanner = Scanner(System.`in`)
    println("Judul Buku: ")
    pinjem.booktitle=scanner.nextLine()

    println("Masukkan nama Peminjam: ")
    pinjem.borrower=scanner.nextLine()

    println("Pinjam berapa hari? (tidak boleh minus!)")
    pinjem.loanDuration=scanner.nextInt()

    val denda = pinjem.calculateFine()
    println("Judul Buku: ${pinjem.booktitle}\nNama Peminjam: ${pinjem.borrower}\nLoan Duration: ${pinjem.loanDuration}\nTotal Denda: Rp $denda")
}