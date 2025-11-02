package org.example

import org.example.lessons.lesson16.homeworks.Animals.Animal
import org.example.lessons.lesson16.homeworks.Animals.Bird
import org.example.lessons.lesson16.homeworks.Animals.Cat
import org.example.lessons.lesson16.homeworks.Animals.Dog
import org.example.lessons.lesson16.homeworks.CartOfGoods.CartOfGoods
import org.example.lessons.lesson16.homeworks.GeometricShapes.Circle
import org.example.lessons.lesson16.homeworks.GeometricShapes.Shape
import org.example.lessons.lesson16.homeworks.GeometricShapes.Square
import org.example.lessons.lesson16.homeworks.GeometricShapes.Triangle
import org.example.lessons.lesson16.homeworks.Logger.Logger
import org.example.lessons.lesson16.homeworks.Printer.Inkjet
import org.example.lessons.lesson16.homeworks.Printer.Laser

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
    println("Цикл for от 1 до 10:")
    for (i in 1..10) {
        print("$i ")
    }

        val shapes: List<Shape> = listOf(
            Circle(3),
            Square(4),
            Triangle(3, 4)
        )
        println("Площадь геометрических фигур")
        shapes.forEach { it ->
            it.area()
        }

    val laserPrinter = Laser()
    val inkjetPrinter = Inkjet()
    val shortText = "Hello World from Kotlin Printers"
    val longText = """
        Kotlin — современный статически типизированный язык программирования, 
        который работает на платформе Java и может компилироваться в JavaScript 
        или исполняться с помощью LLVM. Язык разработан компанией JetBrains 
        и получил большое распространение благодаря своей лаконичности, 
        безопасности и отличной совместимости с Java.
    """.trimIndent()
    laserPrinter.printAbstract(longText)
    inkjetPrinter.printAbstract(longText)

    val cart = CartOfGoods(mutableMapOf("Banana" to 2))
    cart.addToCart("Apple")
    cart.addToCart("Milk", 4)
    cart.addToCart(mapOf("Chocolate" to 3, "Eggs" to 10))
    cart.addToCart(listOf("Juice", "Cheese", "Grapes"))
    println(cart.toString())

    val logObject = Logger()
    logObject.log("WARNING", "Лог сообщение ворнинг")
    logObject.log("ERROR", "Лог сообщение еррор")
    logObject.log(listOf("лог1", "лог2", "лог3"))
}