package oop_00000135292_lucas.week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> println("Waspada! ${event.monsterName} muncul!")
        is LootDropped -> {
            val (name, damage, rarity) = event.item // Destructuring
            println("Yeay! Dapat loot: $name (Dmg: $damage, Rarity: $rarity)")
        }
        is GameOver -> println("Game Over: ${event.reason}")
        is SafeZone -> println("Kamu berada di zona aman. Silakan beristirahat.")
    }
}