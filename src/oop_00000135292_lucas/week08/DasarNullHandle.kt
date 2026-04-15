package oop_00000135292_lucas.week08

class set_krs(val nim: String, val kodematkul:String?) {
    fun matkul_wajib(sks: Int?){
        println("Matkul kamu $kodematkul, sks=$sks")
    }
}

fun main(){
    var nama:String?
    nama = null;
    println("Hai ${nama}")

    val settingKRS = set_krs("123",null)
    println("nim kamu ${settingKRS.nim}, matkull kamu ${settingKRS.kodematkul}")
    settingKRS.matkul_wajib(null)

}