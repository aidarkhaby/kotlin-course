package org.example.lessons.lesson20.homeworks

import kotlin.math.absoluteValue

fun Array<Int>.function1(): Pair<Int?, Int?> {
    return if (isEmpty()) {
        Pair(null, null)
    } else {
        Pair(first(), last())
    }
}

fun <T : Comparable<T>> MutableList<T>.function2(arg1: Boolean): List<T> {
    val list = toList()
    if (arg1) {
        sort()
    } else {
        sortDescending()
    }
    return list
}

fun <K> Map<K, List<K>>?.function3(num: Int): Map<String, K?>? {
    return this?.mapKeys { it.key.toString() }
        ?.mapValues { it.value.getOrNull(num) }
}

fun Number.within(other: Number, deviation: Number): Boolean {
    val result = (toDouble() - other.toDouble()).absoluteValue
    return if(result < deviation){
        true
    } else{
        false
    }
}

fun String.encrypt(base: Int): String{
    return map { it + base }.joinToString("")
}
fun String.decrypt(base: Int): String {
    return map { it - base }.joinToString("")
}
