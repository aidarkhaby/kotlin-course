package org.example.lessons.lesson14.homeworks

class Shelf(val capacity: Int) {
    private val items = mutableListOf<String>()
    var count: Int = 0

    fun addItem(name: String): Boolean {
        if (canAccommodate(name)){
            items.add(name)
            return true
        }
        else {
            return false
        }
    }

    fun removeItem(name: String): Boolean {
        if (items.contains(name)){
            items.remove(name)
            return true
        }
        else {
            return false
        }
    }

    fun canAccommodate(name: String): Boolean {
        val lengthOfWords = items.map { it.length }.sum()
        return lengthOfWords + name.length <= capacity
    }
    fun containsItem(name: String): Boolean {
        return items.contains(name)
    }

    fun getItems(): List<String> {
        return items.toList()
    }

}