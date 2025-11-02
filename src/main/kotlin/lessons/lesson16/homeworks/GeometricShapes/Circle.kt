package org.example.lessons.lesson16.homeworks.GeometricShapes

class Circle(val radius: Int): Shape() {
    override fun area(): Double {
        val result: Double = radius * radius * 3.14
        println("площадь круга: $result")
        return result
    }
}