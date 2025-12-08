package org.example.lessons.lesson23.homeworks

fun fun2(bigNumber: Long): Int {
    require(bigNumber > 0) { "Число должно быть больше нуля" }
    return "$bigNumber".sumOf { it.digitToInt() }
}

fun main() {
    val anonymousFunc = fun(bigNumber: Long): Int {
        require(bigNumber > 0) { "Число должно быть больше нуля" }
        return "$bigNumber".sumOf { it.digitToInt() }
    }

    val lambdaWithType: (Long) -> Int = { a ->
        require(a > 0) { "Число должно быть больше нуля" }
        "$a".sumOf { it.digitToInt() }
    }

    val lambdaNoType = { a: Long ->
        require(a > 0) { "Число должно быть больше нуля" }
        "$a".sumOf { it.digitToInt() }
    }

}