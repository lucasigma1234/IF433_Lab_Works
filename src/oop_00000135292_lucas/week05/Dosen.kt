package oop_00000135292_lucas.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahaan dan merevisi RPKPS.")
    }
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}