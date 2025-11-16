package org.example.lessons.lesson19.homeworks

interface Validator <N> {
    fun validate(element: N): Boolean
}