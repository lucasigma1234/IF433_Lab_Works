package oop_00000135292_lucas.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk didepan kompuiter melayani administrasi.")
    }

    fun doAdminWork() {
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}