package oop_00000135292_lucas.week07

fun main() {
    println("server: ${Koneksi.linkServer}")
    Koneksi.test_koneksi();

    Mahasiswa.nama = "udin";
    val na:Int = Mahasiswa.set_nilai(80, 100);
    println("nilai ${Mahasiswa.nama} adalah $na");

    Mahasiswa.isi_nama_kampus("UMN");

    val dsn1= Dosen(nama= "Alya Azmi", nik= "270106", tahunMasuk=2021);
    println(dsn1);
    val dsn2= dsn1.copy(nama= "Lucas", nik= "241205");
    println(dsn2);
    //cara liat data satu field aja
    println("Nama dosen1: ${dsn1.nama} masuk tahun ${dsn1.tahunMasuk}");

    println("matkul favorit saya adalah:" +MataKuliah.OOP.name);
    println("index matkul:" + MataKuliah.OOP.ordinal);
    MataKuliah.OOP.sks_matkul();

    //looping muncul semua
    for(matkul in MataKuliah.entries){
        print("matkul:" + matkul +" ");
        matkul.sks_matkul();
    }
}