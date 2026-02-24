package oop_00000135292_lucas.week03

class Employee(val name: String) {

    var salary: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}