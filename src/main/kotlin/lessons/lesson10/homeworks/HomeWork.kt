package org.example.lessons.lesson10.homeworks

class HomeWork {

    //Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val typicalMap = mapOf<Int, Int>()

    //Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val floatDoubleMap = mapOf(1.0f to 2.0, 2.0f to 4.0)

    //Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val map3 = mutableMapOf(0 to "zero", 1 to "one")

    //Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    fun ex4(){
        val map4 = mutableMapOf(0 to "zero", 1 to "one")
        map4[2] = "two"
    }

    //Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
    fun ex5(){
        val map4 = mutableMapOf(0 to "zero", 1 to "one")
        val number = map4[0]
        val numberDoesntExist = map4[10]
    }

    //Удалите определенный элемент из изменяемого словаря по его ключу.
    fun ex6(){
        val map6 = mutableMapOf(0 to "zero", 1 to "one")
        map6.remove(0)
    }

    //Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
    // Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    fun ex7(){
        val map7 = mutableMapOf(0.1 to 0, 0.5 to 2, 1.0 to 4, 1.5 to 6)
        for((doubleNum, intNum) in map7){
            if(intNum == 0){
                println("бесконечность")
                continue
            }
            println("${doubleNum/intNum}")
        }
    }

    //Измените значение для существующего ключа в изменяемом словаре.
    fun ex8(){
        val map8 = mutableMapOf(0 to "zero", 1 to "one")
        map8[0] = "Mutable zero"
    }

    //Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    fun ex9(){
        val map1 = mapOf(0 to "zero", 1 to "one")
        val map2 = mapOf(2 to "two", 3 to "three")
        val map3 = mutableMapOf<Int, String>()
        for((intNum, stringNum) in map1){
            map3[intNum] = stringNum
        }
        for((intNum, stringNum) in map2){
            map3[intNum] = stringNum
        }
        println(map3)
    }

    //Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
    val map1 = mapOf<String, List<Int>>("first" to listOf(1,2,3), "second" to listOf(4,5,6))

    //Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь.
    //Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.
    fun ex11(){
        val map11 = mutableMapOf<Int, MutableSet<String>>(0 to mutableSetOf("cat", "dog"), 1 to mutableSetOf("monkey", "lion"))
        val animals = map11[0]
        animals?.add("bear")
        println(animals)
    }

    //Создай словарь, где ключами будут пары чисел.
    // Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
    fun ex12(){
        val map12 = mapOf(
            Pair(1, 2) to "Первая пара",
            Pair(5, 8) to "Пара с пятеркой в начале",
            Pair(3, 5) to "Пара с пятеркой в конце",
            Pair(10, 15) to "Пара с пятеркой внутри",
            Pair(7, 9) to "Обычная пара",
            Pair(5, 5) to "Две пятерки"
        )
        for((k, v) in map12){
            if (k.first == 5 || k.second == 5){
                println("$k $v")
            }
        }
    }




    //Задачи на подбор оптимального типа для словаря
    //Словарь библиотека: Ключи - автор книги, значения - список книг
    val mapOfBooks = mapOf<String, List<String>>()

    //Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val mapOfPlants = mapOf<String, List<String>>()

    //Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val mapOfTeams = mapOf<String, List<String>>()

    //Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val mapOfHeal = mapOf<String, List<String>>()

    //Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val mapOfCountries = mapOf<String, Map<String, List<String>>>()
}