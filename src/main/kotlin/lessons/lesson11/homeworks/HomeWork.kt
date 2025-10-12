package org.example.lessons.lesson11.homeworks

class HomeWork {
    //Задачи на сигнатуру метода
    //Не принимает аргументов и не возвращает значения.
    fun ex1() {
    }

    //Принимает два целых числа и возвращает их сумму.
    fun ex2(a: Int, b: Int): Int {
        return a + b
    }

    //Принимает строку и ничего не возвращает.
    fun ex3(arg: String) {
    }

    //Принимает список целых чисел и возвращает среднее значение типа Double.
    fun ex4(arg1: List<Int>): Double {
        return arg1.average()
    }

    //Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
    private fun ex5(arg: String?): Int? {
        return arg?.length
    }

    //Не принимает аргументов и возвращает nullable вещественное число.
    fun ex6(): Double? {
        val doubleNum: Double? = 1.15
        return doubleNum
    }

    //Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
    private fun ex7(arg: List<Int>?) {
    }

    //Принимает целое число и возвращает nullable строку.
    fun ex8(arg: Int): String? {
        return if (arg > 0) "positive" else null
    }

    //Не принимает аргументов и возвращает список nullable строк.
    fun ex9(): List<String?> {
        val listString: List<String?> = listOf("мама", "папа", "я", null)
        return listString
    }

    //Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
    fun ex10(arg: String?, arg2: Int?): Boolean? {
        val boolNum: Boolean? = true
        return boolNum
    }

    //Задачи на написание кода
    //Напишите валидную сигнатуру метода а так же рабочий код для задач.
    //Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
    fun multiplyByTwo(arg: Int): Int {
        return arg * 2
    }

    //Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
    fun isEven(arg: Int): Boolean {
        return arg % 2 == 0
    }

    //Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
    // Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
    fun printNumbersUntil(n: Int) {
        if (n < 1) {
            return
        }
        for (i in 1..n) {
            println(i)
        }
    }

    //Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
    //Если отрицательных чисел нет, функция должна вернуть null.
    fun findFirstNegative(listInt: List<Int>): Int? {
        for (element in listInt) {
            if (element < 0) {
                return element
            }
        }
        return null
    }

    //Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
    //Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
    fun processList(arg: List<String?>) {
        for (elements in arg) {
            if (elements == null) {
                return
            }
            println(elements)
        }
    }


}