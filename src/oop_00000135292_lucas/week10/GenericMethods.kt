package oop_00000135292_lucas.week10

// Fungsi generik dengan awalan <T> sebelum nama fungsi [cite: 245, 247]
fun <T> printData(data: T) {
    println("Data yang diterima: $data")
    // Fungsi yang mengembalikan tipe data yang sama dengan parameternya [cite: 253, 254]
    fun <T> processData(input: T): T {
        return input
    }
}