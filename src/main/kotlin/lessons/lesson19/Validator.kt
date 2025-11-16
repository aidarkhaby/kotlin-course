package org.example.lessons.lesson19

interface Validator <N> {
    fun validate(element: N): Boolean
}