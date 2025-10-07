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

    //Создай функцию, которая принимает массив строк и строку для поиска.
// Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()).
// Распечатай найденный элемент.
    fun homeworkArraysString(argArray: Array<String>, argString: String){
        for(i in argArray.indices){
            if (argArray[i].contains(argString)){
                println(argArray[i])
            }
        }
    }




    //Работа со списками List
    //Создайте пустой неизменяемый список целых чисел.
    val emptyList1: List<Int> = listOf()

    //Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val stringList: List<String> = listOf("Hello", "World", "Kotlin")

    //Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    //Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    fun addToList(){
        val mutableList2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
        mutableList2.add(6)
        mutableList2.add(7)
        mutableList2.add(8)
    }
    //Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    fun funRemoveFromList(){
        val mutableListStrings: MutableList<String> = mutableListOf("One", "World", "Two")
        mutableListStrings.remove("World")
        println(mutableListStrings)
    }

    //Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    fun numbersIntCycle(){
        val numbersIntForCycle: List<Int> = listOf(1, 2, 3)
        for(element in numbersIntForCycle){
            println(element)
        }
    }

    //Создайте список строк и получите из него второй элемент, используя его индекс.
    fun ex7(){
        val listOfStringsEx7: List<String> = listOf("One", "World", "Two")
        listOfStringsEx7.get(2)
    }

    //Имея изменяемый список чисел, измените значение элемента на определенной
    // позиции (например, замените элемент с индексом 2 на новое значение).
    fun ex8(){
        val listNumbersEx8: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
        listNumbersEx8[2] = 100
    }
    //Создайте два списка строк и объедините их в один новый список,
    // содержащий элементы обоих списков. Реши задачу с помощью циклов.
    fun ex9(){
        val stringListEx9First: List<String> = listOf("Good", "Morning", "Kotlin")
        val stringListEx9Second: List<String> = listOf("Bye-Bye", "Good Night", "Java")
        val stringListEx9Third: MutableList<String> = mutableListOf()
        for (element in stringListEx9First){
            stringListEx9Third.add(element)
        }
        for (element in stringListEx9Second){
            stringListEx9Third.add(element)
        }
    }

    //Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    fun ex10(){
        val ex10IntList = listOf(14, 20, 5, 38, 90, 4, 10)
        var min = ex10IntList[0]
        var max = ex10IntList[0]
        for (element in ex10IntList){
            if (element < min){
                min = element
            }
            if(element > max){
                max = element
            }
        }
        println("Минимальное - $min Максимальное - $max")
    }

    //Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    fun ex11(){
        val ex11IntList = listOf(14, 11, 3, 20, 5, 38, 90, 4, 10, 13)
        val ex11IntListNew: MutableList<Int> = mutableListOf()
        for (element in ex11IntList){
            if(element % 2 == 0){
                ex11IntListNew.add(element)
            }
        }
    }





    //Работа с Множествами Set
    //Создайте пустое неизменяемое множество целых чисел.
    val numbersSet: Set<Int> = setOf()

    //Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val numbersSetEx1: Set<Int> = setOf(1, 2, 3)

    //Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val stringSetEx2: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")

    //Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    fun setEx4(){
        val stringSetEx4: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
        stringSetEx4.add("Swift")
        stringSetEx4.add("Go")
    }

    //Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    fun setEx5(){
        val numbersEx5: MutableSet<Int> = mutableSetOf(1, 2, 3)
        numbersEx5.remove(2)
    }

    //Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    fun setEx6(){
        val numbersEx6: Set<Int> = setOf(1, 2, 3, 4, 5)
        for(element in numbersEx6){
            println(element)
        }
    }

    //Создай функцию, которая принимает множество строк (set) и строку и проверяет,
    // есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
    fun setEx7(setOfStrings: Set<String>, string: String) {
        for(element in setOfStrings){
            if(string == element){
                println(true)
            }
        }
    }

    //Создайте множество строк и конвертируйте его в изменяемый список строк с использованием цикла.
    fun setEx8(){
        val stringSetEx8: Set<String> = setOf("Kotlin", "Java", "Scala")
        val stringSetEx8Mutable: MutableSet<String> = mutableSetOf()
        for(element in stringSetEx8){
            stringSetEx8Mutable.add(element)
        }
        println(stringSetEx8Mutable)
    }
}