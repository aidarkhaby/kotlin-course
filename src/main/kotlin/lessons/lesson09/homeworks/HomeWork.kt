package org.example.lessons.lesson09.homeworks

class HomeWork {
    fun homeworkLesson09() {
        //Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
        val numbers = arrayOf(1, 2, 3, 4, 5)

        //Создайте пустой массив строк размером 10 элементов.
        val emptyArray = Array(10) { "" }

        //Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
        val doubles = DoubleArray(5)
        for (i in doubles.indices) {
            doubles[i] = i * 2.0
        }

    //Создайте массив из 5 элементов типа Int.
// Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
        val intArray = IntArray(5)
        for (i in intArray.indices) {
            intArray[i] = i * 3
        }

        //Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
        val emptyNullableArray = arrayOfNulls<String>(3)
        emptyNullableArray[1] = ""
        emptyNullableArray[2] = ""

        //Создайте массив целых чисел и скопируйте его в новый массив в цикле.
        val numbersForCopy = arrayOf(1, 2, 3, 4, 5)
        val numbersAfterCopy = IntArray(5)
        for (i in numbersForCopy.indices){
            numbersAfterCopy[i] = numbersForCopy[i]
        }

        //Создайте два массива целых чисел одинаковой длины.
    // Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
        val numbersArray1 = arrayOf(10, 20, 30, 40, 50)
        val numbersArray2 = arrayOf(1, 2, 3, 4, 5)
        val numbersResult = IntArray(5)
        for (i in numbersResult.indices){
            numbersResult[i] = numbersArray1[i] - numbersArray2[i]
        }
        for (i in numbersResult.indices){
            println(numbersResult[i])
        }

    //Создайте массив целых чисел. Найдите индекс элемента со значением 5.
    // Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
        val numbersForWhile = arrayOf(2, 8, 3, 5, 7, 1, 5, 9)
        var index = 0
        var foundIndex = -1 // По умолчанию -1, если элемент не найден

        while (index < numbersForWhile.size) {
            if (numbersForWhile[index] == 5) {
                foundIndex = index
                break // Прерываем цикл при нахождении первого вхождения
            }
            index++
        }

    //Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
    // Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
        val numbersForExercise = arrayOf(2, 8, 3, 5, 7, 1, 5, 9)
        for (i in numbersForExercise.indices){
            val parity = if (numbersForExercise[i] % 2 == 0) "четное" else "нечетное"
            println("${numbersForExercise[i]} - $parity")
        }
    }
}