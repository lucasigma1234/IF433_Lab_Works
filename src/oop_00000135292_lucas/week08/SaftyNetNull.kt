package oop_00000135292_lucas.week08


fun main(){
    var nama:String? = "Alya"

    try {
        println("nama kamu ${nama!!.uppercase()}");
        val hitungan = 10/0;
    } catch (ex: NullPointerException) {
        println("errornya adalah ${ex.message}")
    } catch (ex: ArithmeticException) {
        println("errornya artihmetcic adalah ${ex.message}")
    }
    var dataMhs: List<Any> = listOf(123,"Antony", 20, "Bekasi")
    for (item in dataMhs) {
        var itemFilter = item as? String
        if (itemFilter != null) {
            println(itemFilter);
        }
    }
}