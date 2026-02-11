package oop_00000135292_lucas.week02

class Student (val name: String, val nim: String, val major: String) {
    init {
        if (nim.length != 5) {
            println("Warning: objek tercipta dengan NIL ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah disistem.")
        } else {
            println("Log: objek student $name berhasil dialokasikan di memory.")
        }
    }
}

{
    //body class
}