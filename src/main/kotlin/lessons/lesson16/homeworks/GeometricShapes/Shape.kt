package org.example.lessons.lesson16.homeworks.GeometricShapes

import org.example.lessons.lesson16.homeworks.Animals.Animal
import org.example.lessons.lesson16.homeworks.Animals.Bird
import org.example.lessons.lesson16.homeworks.Animals.Cat
import org.example.lessons.lesson16.homeworks.Animals.Dog

abstract class Shape {
    open fun area(): Double {
        return 0.0
    }
}