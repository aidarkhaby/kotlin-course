package org.example.lessons.lesson15.homeworks

class Chair(
    name: String,
    material: String,
    price: Double,
    val maxWeight: Double,
    val hasBackrest: Boolean,
    val hasArmrests: Boolean,
    val isStackable: Boolean
): Furniture("Стул", material, price) {
}