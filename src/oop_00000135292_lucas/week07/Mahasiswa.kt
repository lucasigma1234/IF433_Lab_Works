package oop_00000135292_lucas.week07

class Mahasiswa private constructor(val kampus:String) {
    companion object {
        var nama:String= "unknowm";

        fun set_nilai(uts:Int, uas:Int):Int{
            return (uts+uas)/2;
        }
        fun isi_nama_kampus(namaUniv:String){
            Mahasiswa(kampus = namaUniv);
        }
    }
    //bagian class biasa
    init {
        println("nama kampus kamu $kampus");
    }
}
