package oop_00000135292_lucas.week07

object DatabaseManager {
    var connectionStatus: String= "Disconnected"

    fun connect(){
        connectionStatus = "Connected to Server"
        println("Database is ready")
    }
}