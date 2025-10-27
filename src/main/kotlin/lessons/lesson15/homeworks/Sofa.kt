package org.example.lessons.lesson15.homeworks

class Sofa(
    name: String,
    material: String,
    price: Double,
    val seatsCount: Int,
    val isConvertible: Boolean
): Furniture("Диван", material, price) {
}