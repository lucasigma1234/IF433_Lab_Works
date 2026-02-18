package oop_00000135292_lucas.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {

    fun attack(targetName: String) {
        println("$name menyerang $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage

        // Proteksi agar HP tidak minus
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }