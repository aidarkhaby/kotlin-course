package org.example.lessons.lesson16.homeworks.GeometricShapes

class Triangle(
    val height: Int,
    val base: Int,
): Shape() {
    override fun area(): Double {
        val result: Double = (height * base / 2).toDouble()
        println("Площадь треугольника: $result")
        return result
    }
}