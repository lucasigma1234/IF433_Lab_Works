package oop_00000135292_lucas.week01

fun main(args: Array<String>) {
    var radius: Double = 7.0
    var pi: Double = 3.14
    var area:  Double = pi * radius * radius
    printlnb("Radius: "+radius", Area:"+area)
    checkSize(area)
}
fun checkSize(area:  Double) {
    if (area > 100) {
        println("this is a big circle")
    } else {
        println("this is a small circle")
    }
}