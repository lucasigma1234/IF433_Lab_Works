package oop_00000135292_lucas.week07

import javax.xml.crypto.Data

fun Main () {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val data1 = DataUsers("Alice", 22)
    val data2 = DataUsers("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("hasil copy: $data3")
    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil di tarik")
    val uiMessage = when(response){
        ApiResponse.Loading -> "Loading..."
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan Error: ${response.message}"
    }
    println(uiMessage)
}