package org.example.lessons.lesson19

interface Mapper<T, L>{
    fun convertElements(arg1: T): L
    fun convertElements(arg1: List<T>): List<L>
}
