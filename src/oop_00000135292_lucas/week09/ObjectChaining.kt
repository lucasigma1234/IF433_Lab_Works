package oop_00000135292_lucas.week09

data class Student(val name: String, val gpa: Double)
fun main() {
    val students = listOf(
        Student("Andi", 3.2),
        Student("Budi", 3.9),
        Student("Citra", 2.8),
        Student("Dewi", 3.7)
    )
    println("=== HONOR STUDENTS PIPELINE ===")
    val honorNames = students
        .filter { it.gpa >= 3.5 }         // 1. Buang yang GPA < 3.5 [cite: 115]
        .sortedBy { it.name }             // 2. Urutkan berdasarkan nama [cite: 116]
        .map { it.name.uppercase() }      // 3. Ambil namanya & jadikan kapital [cite: 117]

    honorNames.forEach { println("Honor Roll: $it") }
}