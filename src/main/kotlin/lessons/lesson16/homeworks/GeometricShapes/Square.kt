package org.example.lessons.lesson16.homeworks.GeometricShapes

class Square(val side: Int): Shape() {
    override fun area(): Double {
        val result = (side * side).toDouble()
        println("Площадь квадрата: $result")
        return result
    }
}