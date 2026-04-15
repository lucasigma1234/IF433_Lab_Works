package oop_00000135292_lucas.week04

class Pasta: Makanan() {
    private var toping: String = "";
    public fun pasta_terjual(jml: Int){
        this.toping = "nora";
        super.harga = jml * 120;
        println("Pasta $jml laris $harga");
    }
    override public fun jual_makanan() {
        println("Saya jual pasta enak");
    }
}