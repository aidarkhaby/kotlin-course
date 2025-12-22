package org.example.lessons.lesson28.homeworks

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun main(){
    val instant = Instant.now()
    val birthDate = LocalDate.of(1998, 5, 20)
    val currentDate = LocalDate.of(2025, 12, 22)
    val period = Period.between(birthDate, currentDate)
    println(instant)
    println(birthDate)
    println(period)

    ex4(birthDate)
    ex4(LocalTime.of(18, 0, 0))
    ex4(LocalDateTime.of(2024, 4, 1, 9, 0, 0))
    ex4(ZonedDateTime.of(2024, 2, 26, 10, 0, 0, 0, ZoneId.of("Europe/Madrid")))

    val birthDate1 = LocalDate.of(1950, 5, 15)
    val birthDate2 = LocalDate.of(2000, 8, 20)
    val birthDate3 = LocalDate.of(1980, 3, 10)

    println("Дата рождения: ${birthDate1}")
    birthDate1.identifyGeneration()

    println("\nДата рождения: ${birthDate2}")
    birthDate2.identifyGeneration()

    println("\nДата рождения: ${birthDate3}")
    birthDate3.identifyGeneration()

    val date1 = LocalDate.of(2023, 2, 25)
    val date2 = LocalDate.of(2024, 2, 25)
    val formatter = DateTimeFormatter.ofPattern("MM-dd")
    println(date1.plusDays(10).format(formatter))
    println(date2.plusDays(10).format(formatter))
}

fun ex4(arg: Temporal){
    when(arg){
        is LocalDate -> "dd-MM-YYYY"
        is LocalTime -> "HH-mm-ss"
        is LocalDateTime -> "dd-MM-YYYY HH:mm:ss"
        is ZonedDateTime -> "dd-MM-YYYY HH:mm:ss z"
        else -> throw IllegalArgumentException("Неизвестный тип данных")
    }.let {
        DateTimeFormatter.ofPattern(it).format(arg)
    }.also { println(it) }
}

private val BOOMER_START = LocalDate.of(1946, 1, 1)
private val BOOMER_END = LocalDate.of(1964, 12, 31)
private val ZOOMER_START = LocalDate.of(1997, 1, 1)
private val ZOOMER_END = LocalDate.of(2012, 12, 31)

fun LocalDate.identifyGeneration(){
    when {
        (this >= BOOMER_START && this <= BOOMER_END) -> println("Бумер")
        (this >= ZOOMER_START && this <= ZOOMER_END) -> println("Зумер")
        else -> println("Не определено")
    }
}

