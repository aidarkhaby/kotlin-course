package org.example.lessons.lesson15.homeworks

class Circle(
    anglesCount: Int,
    perimeter: Int,
    square: Double,
    val radius: Int
) : GeometricShapes(0, perimeter, square){
    fun squareCount(radius: Int): Double {
        return (3.14 * radius * radius)
    }
}