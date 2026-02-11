package oop_00000135292_lucas.week02

import java.util.Scanner

class Student (val name:String,val nim:String, val major:String){
    init{
        //Validasi sederhana: Cek panjang NIM
        if (nim.length != 5){
            println("WARNING: Object tercipta dengan NIM ($nim) yang tidak tidak valid")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        }else {
            println("LOG: Object Student $name berhasil dialokasikan di Memory")
        }
    }

    constructor(name: String, nim: String): this(name, nim, "Non-Matriculated"){
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}

fun main(){
    val scanner = Scanner(System.`in`)
    println("---APK PMB UMN---")
    println("Masukkan Nama: ")
    val name = scanner.nextLine()
    println("Masukkan NIM (wajib 5 karakter): ")
    val nim = scanner.next()
    scanner.nextLine()

    //validasi disisi pemanggil
    if(nim.length != 5) {
        println("EROR: pendaftaran di batalkan. NIM harus 5 karakter.")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextInt()

        //instalasi objek data sudah aman
        val s1= Student(name, nim, major)
        println("Status: pendaftaran selesai.")
    }
}