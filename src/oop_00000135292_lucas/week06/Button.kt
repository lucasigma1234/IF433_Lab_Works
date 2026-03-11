package oop_00000135292_lucas.week06

class Button(override val name: String):  Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}