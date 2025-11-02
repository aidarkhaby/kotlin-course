package org.example.lessons.lesson16.homeworks.Printer

class Inkjet: Printer() {
    private val colorPairs = listOf(
        Pair(31, 44), // Красный на синем
        Pair(32, 43), // Зелёный на жёлтом
        Pair(33, 41), // Жёлтый на красном
        Pair(34, 42), // Синий на зелёном
        Pair(35, 46), // Пурпурный на голубом
        Pair(36, 45), // Голубой на пурпурном
        Pair(37, 40), // Белый на чёрном
        Pair(30, 47)  // Чёрный на белом
    )
    override fun printAbstract(text: String) {
        val words = text.split(" ")
        println("\n=== Струйный принтер печатает ===")

        var colorIndex = 0
        words.forEach { word ->
            if (word.isNotBlank()) {
                val (textColor, bgColor) = colorPairs[colorIndex]
                // Цветные буквы на цветном фоне
                println("\u001B[${textColor};${bgColor}m $word \u001B[0m")

                // Переход к следующему цвету
                colorIndex = (colorIndex + 1) % colorPairs.size
            }
        }
        println("\n=== Печать завершена ===\n")
    }
}