package oop_00000135292_lucas.week08

class Alamat (val nomor:Int, val kota:String)
class Mahasiswa(val nim:String, val addr: Alamat?)

fun main(){
    val almt = Alamat(23,"London")
    val mhs = Mahasiswa("213124", addr = almt)

    val defaultAlamat = mhs.addr?.let {
            alamatAsli -> "Sini nih... ${mhs.addr.kota} nomornya ${mhs.addr.nomor}";
    }?:"gak jelas, gatau dimana"

    println("Nim-nya ${mhs.nim} tinggalnya di ${defaultAlamat}");
}