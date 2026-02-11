package oop_00000135292_lucas.week02

import java.util.Scanner

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

{
    //body class
}