package org.example.lessons.lesson19.homeworks

import org.example.lessons.lesson19.homeworks.Mapper as Mapper1

class PhrasesToListOfStrings: Mapper1<String, List<String>> {
    override fun convertElements(arg1: String): List<String> {
        return arg1.split(" ")
    }
    override fun convertElements(arg1: List<String>): List<List<String>> = arg1.map {
        it.split(" ")
    }

    fun <V, N> transposition(map: Map<V, N>): Map<N, V> {
        return map.map { it }.associate { it.value to it.key }
    }
}
