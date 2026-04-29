package oop_00000135292_lucas.week10

// Repository generik untuk menyimpan berbagai jenis entitas [cite: 298, 300]
class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item) [cite: 301]
    }

    fun getAll(): List<T> {
        return items [cite: 301]
    }

    // Checkpoint 14: week10: (task) implement search logic in repository [cite: 312]
    fun find(predicate: (T) -> Boolean): T? {
        return items.find(predicate)
    }
}