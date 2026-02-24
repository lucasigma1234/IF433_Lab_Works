package oop_00000135292_lucas.week03

class Employee(val name: String) {

    var salary: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    private var performanceRating: Int = 0

    fun setPerformanceRating(rating: Int) {
        if (rating in 1..5) {
            performanceRating = rating
        }
    }
}