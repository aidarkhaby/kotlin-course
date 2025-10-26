package org.example.lessons.lesson14.homeworks

class Rack(val shelves: MutableList<Shelf>, val maxShelfCount: Int) {
    private var countShelves = 0

    fun containsItem(name: String): Boolean {
        return shelves.any { it.containsItem(name) }
    }

    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

    fun addShelf(name: Shelf): Boolean {
        if(shelves.contains(name) || shelves.size == maxShelfCount){
            return false
        }
            shelves.add(name)
            countShelves++
            return true
    }

    fun removeShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }
        val items = shelves[index].getItems()
        shelves.removeAt(index)
        return items
    }
}