package oop_00000135292_lucas.week10

data class Coin(val name: String, val balance: Double)
data class Transaction(val id: String, val amount: Double)
class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()
    fun add(item: T) {
        items.add(item)
    }
    fun getAll(): List<T> {
        return items
    }
    fun searchByName(query: String): List<T> {
        return items.filter { item ->
            if (item is Coin) {
                item.name.contains(query, ignoreCase = true)
            } else {
                item.toString().contains(query, ignoreCase = true)
            }
        }
    }
}