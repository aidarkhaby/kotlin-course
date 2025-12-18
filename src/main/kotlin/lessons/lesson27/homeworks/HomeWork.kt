package org.example.lessons.lesson27.homeworks

object NumsObject {
    const val ONE = "ONE"
    const val TWO = "TWO"
    const val THREE = "THREE"
}

enum class Status {
    PASSED,
    BROKEN,
    FAILED
}

enum class RealEstate(val nameOfObject: String) {
    HOUSE("Дом"),
    APARTMENT("Квартира"),
    ROOM("Комната"),
    ;

    fun printEstateName() {
        println(RealEstate.entries.sortedBy { it.name.length })
    }
}

enum class Planets(
    val planetName: String,     // Название планеты
    val distanceToSun: Int,     //Расстояние до солнца в миллионах километров
    val weight: Double          // Вес в кг, надо умножить на 10 в 24 степени
) {
    MERCURY("Меркурий", 58, 0.055),
    VENUS("Венера", 108, 0.815),
    EARTH("Земля", 150, 1.0)
    ;
}

fun ex3(fnc: () -> Unit): Status {
    return try {
        fnc()
        Status.PASSED
    } catch (e: AssertionError) {
        Status.FAILED
    } catch (e: Throwable) {
        Status.BROKEN
    }
}

fun ex4(fnc: (Planets) -> Boolean): Planets {
    return Planets.entries
        .firstOrNull(fnc)
        ?: throw NoSuchElementException("Планета не найдена")
}


fun main(){
    RealEstate.HOUSE.printEstateName()
    ex3(fun (){})
}
