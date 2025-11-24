package org.example.lessons.lesson22.homeworks


fun main(){
    //NullPointerException
    try {
        val arg1: Int? = null
           println(arg1 as Int)
    } catch (e: NullPointerException){
        println("Это обработка NullPointerException")
    }

    //IndexOutOfBoundsException
    try {
        val arg2 = arrayOf(1, 2, 3)
           println(arg2[99])
    } catch (e: IndexOutOfBoundsException){
        println("Это обработка IndexOutOfBoundsException")
    }

    //ClassCastException
    try {
        val str: String = "123"
        val classCastEx = str as Int
    } catch (e: ClassCastException){
        println("Это обработка ClassCastException")
    }

    //NumberFormatException
    try {
        val number = "abc"
        println(number.toInt())
    } catch (e: NumberFormatException){
        println("Это обработка NumberFormatException")
    }

    //IllegalArgumentException
    try {
        printPositiveNumber(-10)
    } catch (e: IllegalArgumentException){
        println("Это обработка IllegalArgumentException")
    }

    //IllegalStateException
    try {
        checkIsNumPositive(-123)
    } catch (e: IllegalStateException){
        println("Это обработка IllegalStateException")
    }

    //OutOfMemoryError
    try {
        generateLargeList()
    } catch (e: OutOfMemoryError){
        println("Это обработка OutOfMemoryError")
    }

    //StackOverflowError
    try {
        recursiveFunction()
    } catch (e: StackOverflowError){
        println("Это обработка StackOverflowError")
    }

    ex10(null)
    ex10("qweerty!")
    ex10(listOf(""))
    ex10(listOf(1, 2, 3))
    ex10(listOf(1, 2, "qwerty"))
    ex10(listOf(1, 2, "3"))

    throw MyCoolException("Text")

}

fun printPositiveNumber(arg: Int){
    require(arg > 0)
    println(arg)
}

fun checkIsNumPositive(arg: Int) {
    check(arg > 0) {"Число меньше нуля"}
}


fun generateLargeList() {
    val largeList = mutableListOf<Int>()
    while (true) {
        largeList.add(1) // Бесконечно добавляем элементы в список
    }
}

fun recursiveFunction() {
    recursiveFunction() // Бесконечный рекурсивный вызов
}

fun ex10(arg: Any?){
    try{
        arg!!
        arg as List<*>
        arg[10]
        require(arg[2] is String)
        check((arg[2] as String).toInt() == 3)

    } catch (e: Throwable){
        val result = when(e){
            is NullPointerException -> println("Это NullPointerException")
            is IndexOutOfBoundsException -> println("Это IndexOutOfBoundsException")
            is ClassCastException -> println("Это ClassCastException")
            is IllegalArgumentException -> println("Это IllegalArgumentException")
            is NumberFormatException -> println("Это NumberFormatException\n")
            is IllegalStateException -> println("Это IllegalStateException")
            else -> println("Не понятная ошибка")
        }
        println(result)
        throw e
    }
    println("Это крутая функция без исключений")
}

class MyCoolException(message: String) : AssertionError(message){
}