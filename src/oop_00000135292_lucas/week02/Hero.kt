package oop_00000135292_lucas.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- MINI RPG BATTLE ---")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(heroName, baseDamage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\n1. Serang")
        println("2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Musuh")

            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("HP Musuh sekarang: $enemyHp")

            // Musuh membalas jika masih hidup
            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh menyerang balik! Damage: $enemyDamage")

                hero.takeDamage(enemyDamage)
                println("HP Hero sekarang: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("🏃 Hero kabur dari pertempuran!")
            break
        } else {
            println("Input tidak valid!")
        }
    }

    println("\n--- HASIL PERTEMPURAN ---")
    if (hero.isAlive() && enemyHp <= 0) {
        println("🏆 HERO MENANG!")
    } else if (!hero.isAlive()) {
        println("☠️ HERO KALAH!")
    } else {
        println("⚖️ Pertempuran dihentikan.")
    }
}
    }