package oop_00000135292_lucas.week02


import java.util.Scanner

class hero (var name: String, var hp: Int, var baseDamage: Int){
    init{
        hp = 100;
    }
    fun takeDamage (damage: Int): Boolean {
        hp = hp - damage
        if(hp <= 0) {
            println("You died")
            return false
        } else {
            println("You take damage $damage")
            return true
        }
    }
    fun attack (targetName: String){
        println("$name attacked $targetName")
    }
}

fun main(){
    val scanner = Scanner(System.`in`)
    var character = hero("", 100, 0)
    var enemyHp = 100
    val enemy = "Goblin"
    var isAlive = true
    val enemyDamage = (1..20). random()

    print("Input name: ")
    character.name = scanner.nextLine()

    print("Input your damage: ")
    character.baseDamage = scanner.nextInt()

    while(isAlive){
        println("Your HP: ${character.hp}\nEnemy Hp: ${enemyHp}\n1. Serang\n2. Kabur")
        var choice = scanner.nextInt()
        if (choice == 1) {
            character.attack(enemy)
            enemyHp = enemyHp - character.baseDamage
            if (enemyHp > 0){
                character.takeDamage(enemyDamage)
            } else {
                break
            }
        } else if (choice == 2) {
            println("you sucessfully fled from the scene")
            break
        }
    }
    if (character.hp < 0){
        println("you lose!")
    } else if (enemyHp < 0){
        println("you win!")
    }

}