package org.example.lessons.lesson19.homeworks

class ListHolder<T>(){
    private val items = mutableListOf<T>()
    fun addElement(element: T) = items.add(element)
    fun getAllElements(): List<T> = items.toList() // возвращаем неизменяемую копию
}


