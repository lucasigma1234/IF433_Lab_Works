package oop_00000135292_lucas.week06

interface Organisasi {
    val namaOrganisasi:String;
    val budgetRapat: Int;
    val jumlahOrang: Int;
    val biayaKonsumsi: Int
       get() = budgetRapat * jumlahOrang;

    fun rapat();
    fun keaktifan() {
        println("ih bawel aktif");
    }
}