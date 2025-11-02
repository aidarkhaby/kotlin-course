package org.example.lessons.lesson16.homeworks.Printer

class Laser: Printer() {
    override fun printAbstract(string: String) {
        val words = string.split(" ")
        println("\n=== Лазерный принтер печатает ===")
        words.forEach { word ->
            if(word.isNotBlank()){
                println("\u001B[30;47m $word \u001B[0m")
            }
        }
    }
}