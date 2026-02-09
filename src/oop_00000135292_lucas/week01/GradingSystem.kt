package oop_00000135292_lucas.week01

fun main() {
    var name: string = "lucas"
    var score: int = 80
    println("Nama: $name + , Nilai: $score")
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("grade kamu: $grade")
}
fun calculateStatus(score: int) = if (score > 75) "lulus" else "tidak lulus"
println("Status: ${calculateStatus(score)}")
        val studentId: String?= null
val idLength= studentId?.length ?: 0
println("Panjang ID: $idLength")