package org.example.lessons.lesson16.homeworks.Animals

open class Animal() {
    open fun makeSound(){
        println("This animal makes no sound.")
    }
    fun main(){
        val animals: List<Animal> = listOf(
            Dog(),
            Cat(),
            Bird(),
            Animal(), // Базовый класс без переопределения
            Dog(),
            Cat(),
            Bird()
        )
        println("=== Звуки животных ===")
        animals.forEach { it ->
            it.makeSound()
        }
    }
}