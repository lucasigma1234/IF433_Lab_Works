package oop_00000135292_lucas.week03

class Employee(
    val name: String
) {
    var salary: Int = 0
        set(value) {
            this.salary = value // ❌ SALAH → StackOverflow
        }
}