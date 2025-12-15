package org.example.lessons.lesson12.homeworks

class HomeWork {
    fun homeWork12(){
    val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)

    //Задачи на приведение коллекции к значению
    //Проверить, что размер коллекции больше 5 элементов.
    if (numbers.size > 5){
        println("Размер коллекции больше 5 элементов")
    }

    //Проверить, что коллекция пустая
        if (numbers.isEmpty()){
            println("Коллекция пуста")
        }

    //Проверить, что коллекция не пустая
        if (numbers.isNotEmpty()){
            println("Коллекция заполнена значениями")
        }

    //Взять элемент по индексу или создать значение если индекса не существует
        val elementOrElse = numbers.getOrElse(5){ 999 }

    //Собрать коллекцию в строку
    val listToString = numbers.joinToString {" : "}

    //Посчитать сумму всех значений
        val sumInt = numbers.sum()

    //Посчитать среднее
        val averageOfNumbers = numbers.average()

    //Взять максимальное число
        val maxInt = numbers.max()

    //Взять минимальное число
        val minInt = numbers.min()

    //Взять первое число или null
        val minOrNull = numbers.firstOrNull()

    //Проверить что коллекция содержит элемент
        val elementInNumbers = numbers.contains(4)
        val numbersOfInt = listOf(1, 2, 3, 7, 10, 13, 15, 16, 20, 25, 29, 130, 65, 9, 7, 13, 55)

        //Задачи на обработку коллекций
        //Отфильтровать коллекцию по диапазону 18-30
        numbersOfInt.filter{ it in 18..30}

        //Выбрать числа, которые не делятся на 2 и 3 одновременно
        val blabla = numbersOfInt.filter{ it % 2 != 0 && it % 3 != 0}

        //Очистить текстовую коллекцию от null элементов
        val listOfStrings = listOf("cat", "dog", "bear", null)
        val listWithoutNulls: List<String> = listOfStrings.filterNotNull()
        
        //Преобразовать текстовую коллекцию в коллекцию длин слов
        val listWordsLength = mutableListOf<Int>()
        listOfStrings.forEach{
    //        listWordsLength.add(it.length)
        }

        //Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
       // val mapReversedWords = listOfStrings.associate { it.reversed() to it.length }

        //Отсортировать список в алфавитном порядке
        val listOfStrings2 = listOf("cat", "dog", "bear")
        val sortedListOfStrings = listOfStrings2.sorted()

        //Взять первые 3 элемента списка
        val first3Elements = numbersOfInt.take(3)

        //Распечатать квадраты элементов списка
        numbersOfInt.forEach{
            println(it * it)
        }

        //Группировать список по первой букве слов
        val listOfStrings3 = listOf("cat", "dog", "bear", "deer", "bober", "chicken", "dolphin", "cat", "cat")
        val groupedBySign = listOfStrings3.groupBy { it.first() }

        //Очистить список от дублей
        val distinctString = listOfStrings3.distinct()

        //Отсортировать список по убыванию
        val descendedSortedList = listOfStrings3.sortedDescending()

        //Взять последние 3 элемента списка
        val last3ElementsOfList = listOfStrings3.takeLast(3)
}

    //Задача 24. Характеристика числовой коллекции
    //Напиши функцию, которая принимает коллекцию чисел и возвращает строку с характеристикой коллекции используя конструкцию when

    //Если коллекция пустая - “Пусто”
    //Если количество элементов меньше пяти - “Короткая”
    //Если коллекция начинается с 0 - “Стартовая”
    //Если сумма всех чисел больше 10000 - “Массивная”
    //Если среднее значение равно 10 - “Сбалансированная”
    //Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
    //Если максимальное число меньше -10 - “Отрицательная”
    //Если минимальное число больше 1000 - “Положительная”
    //Если содержит одновременно числа 3 и 14 - “Пи***тая”
    //Иначе - “Уникальная”
    fun ex24(arg: List<Int>): String {
       return when {
           arg.isEmpty() -> "Пусто"
           arg.size < 5 -> "Короткая"
           arg.firstOrNull() == 0 -> "Стартовая"
           arg.sum() > 10000 -> "Массивная"
           //arg.average() == 10 -> "Сбалансированная"
           arg.joinToString().length == 20 -> "Клейкая"
           (arg.maxOrNull() ?: 0) < -10 -> "Отрицательная"
           (arg.minOrNull() ?: 0) > 1000 -> "Положительная"
           arg.contains(3) && arg.contains(14) -> "Пи***тая"
           else -> "Уникальная"
        }
    }
}