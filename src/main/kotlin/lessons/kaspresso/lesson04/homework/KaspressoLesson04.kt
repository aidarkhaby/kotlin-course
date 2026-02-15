package org.example.lessons.kaspresso.lesson04.homework

import kotlin.random.Random

class Inventory {
    val items = mutableListOf<String>()

    operator fun plus(item: String) {
        items.add(item)
    }

    operator fun get(index: Int): String {
        return items[index]
    }

    operator fun contains(item: String): Boolean {
        return item in items
    }
}

class Toggle(val enabled: Boolean) {
    operator fun not(): Toggle {
        return Toggle(!enabled)
    }

    override fun toString() = enabled.toString()
}

class Price(private val amount: Int) {
    operator fun times(price: Int): Int {
        return amount * price
    }
}

class Step(val number: Int){
    operator fun rangeTo(other: Step) = number..other.number
    operator fun contains(range: IntRange) = number in range

}

operator fun IntRange.contains(step: Step) = step.number in this

class Log() {

    private val entries = mutableListOf<String>()

    operator fun plus(entry: String): Log {
        entries.add(entry)
        return this
    }

    fun print() {
        println(entries.joinToString())
    }
}

class Person(private val name: String) {

    private val phrases = mutableListOf<String>()

    fun print() {
        println(phrases.joinToString(" "))
    }

    private fun selectPhrase(first: String, second: String): String {
        val random = Random.nextInt(0, 2)
        return if (random == 0) first else second
    }

    infix fun says(phrase: String): Person {
        phrases.add(phrase)
        return this
    }

    infix fun and(phrase: String): Person {
        check(phrases.isNotEmpty()){ "Функция не может быть вызвана первой. Сначала вызови says" }
        phrases.add(phrase)
        return this
    }

    infix fun or(phrase: String): Person {
        check(phrases.isNotEmpty()) { "Сначала используй says" }
        phrases[phrases.lastIndex] = selectPhrase(phrases[phrases.lastIndex], phrase)
        return this
    }
}


fun main() {
    // 1
    val inventory = Inventory()
    inventory + "1"
    inventory + "2"
    println(inventory[1])
    println("1" in inventory)

    //2
    val toggle = Toggle(false)
    println(!toggle)

    //3
    val price = Price(34)
    println(price * 5)

    //4
    val stepFrom = Step(4)
    val stepTo = Step(10)
    val stepBetween = Step(6)
    val range = stepFrom..stepTo
    println(range.joinToString())
    println(stepBetween in range)

    //5
    val log = Log()
    log + "1" + "2" + "3" + "4"
    log.print()


    //Инфиксные функции
    val andrew = Person("Andrew")
    andrew says "Hello" and "brothers." or "sisters." and "I believe" and "you" and "can do it" or "can't"
    andrew.print()
}