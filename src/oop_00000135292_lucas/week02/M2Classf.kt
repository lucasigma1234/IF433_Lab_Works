package oop_00000135292_lucas.week02

class Pemain {
    var nama:String = "ga terdaftar";
    var speed:Int = 9;
    val shoot:Int = 8;

    init {
        nama = "Alya";
        println("ini adalah constructor pertama");
    }

    constructor(alias: String="Sayangku cintaku", kecepatan:Int=2) {
        nama = alias;
        speed = kecepatan;
        println("ini adalah constructor kedua");
    }

    fun bawa_bola(){
        println("$nama sedang membawa bola");
    }
}

fun main (){
    val player = Pemain(alias= "Ayami", kecepatan=100);
    player.bawa_bola();
    println("nama pemain: ${player.nama}");
    println("skill Kecepatan: "+player.speed);

    val player2= Pemain(alias= "Lucas", kecepatan= 99);
    println("Pemain yang mencintai Ayami: ${player2.nama}");
    println("Kecepatan: "+ player2.speed);
}