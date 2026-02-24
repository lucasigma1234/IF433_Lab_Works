package oop_00000135292_lucas.week03

fun main() {
    val player = Player("Lucas")

    // player.xp  // ERROR: xp bersifat private

    player.addXp(50)
    player.addXp(60)
}