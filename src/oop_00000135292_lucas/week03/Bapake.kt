package oop_00000135292_lucas.week03

open class Bapake {
    private var nama: String = "tidak terdaftar";
    private var umur: Int = 35;
    protected var gaji: Int = 1000;

    public var uangjajan: Int = 0
        set(value){
            if(value < 0){
                println("gaada duit itu mah")
            }else{
                field = value
            }
        }
        get(){
            return field + 123;
        }

    public fun set_nama(namabaru: String) {
        if (this.nama.length <= 0) {
            println(" nama ga boleh kosong");

        }
        else{
            this.nama = namabaru;
        }
    }
    public fun get_nama(): String {
        return  this.nama
    }

    public fun set_umur(umurbaru: Int) {
        if (this.umur <= 5) {
            println("umur cannot less than -5");
        }
        else{
            this.umur = umurbaru;
        }


    }
    public fun get_umur(): Int {
        return this.umur
    }

}

class Anak: Bapake() {
    fun dapet_gaji(): Int {
        this.gaji = 5000;
        return this.gaji + 100;

    }
}

fun main(){
    var bpk = Bapake();
    bpk.set_nama("yanto");
    println("nama adalah ${bpk.get_nama()}")
    bpk.set_umur(2);
    println("umur ${bpk.get_umur()}")

    var ank = Anak();
    ank.set_nama("toni");
    println("nama bapak kamu ${ank.get_nama()}")
    println("gaji bapak: ${ank.dapet_gaji()}")

    ank.uangjajan = -100;
}