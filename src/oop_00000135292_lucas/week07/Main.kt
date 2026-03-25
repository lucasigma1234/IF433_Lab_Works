package oop_00000135292_lucas.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1) //mencetak memori hash
    println("Sama? ${reg1 == reg2}") // False

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1) // Readable format
    println("Sama? ${data1 == data2}") // True

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = Success("Data berhasil ditarik!")

    val uiMessage = when (response) {
        is Success -> "Tampilkan: ${response.data}"
        is Error -> "Munculkan alert: ${response.message}"
        is Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)

    println("\n=== [TASK] TEST SINGLETON GAME MANAGER ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== [TASK] SIMULASI FACTORY & ENUM ===")
    println("Drop Chance Item LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")
    val playerWeapon = Weapon.forgeStarterSword()
    println("Senjata Baru Ditempa: ${playerWeapon.item}")
    println("\n=== [TASK] BLACKSMITH UPGRADE & BATTLE EVENT ===")

    val upgradedSword = playerWeapon.item.copy(name = "Pedang Kayu Berkekuatan Gaib", damage = 25)
    println("Senjata Setelah Upgrade: $upgradedSword")

    processEvent(SafeZone)
    processEvent(MonsterEncounter("Goblin Nakal"))
    processEvent(LootDropped(upgradedSword))
    processEvent(GameOver("Terkena jebakan racun"))
}