package oop_00000135292_lucas.week05

abstract class Matakuliah {
    var nama: String = "";
    abstract fun set_matkul(sks:Int);
    fun hasil_matkul() {
        println ("matkul diminati");
    }
}