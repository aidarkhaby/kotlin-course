package org.example.lessons.lesson23.homeworks

fun main() {
    println(fun1LambdaNoType(listOf(1, 2, 3, 4, 5, 6, 7)))
}

fun fun1(list: List<Int>): Int {
    require(list.isNotEmpty())
    return list.sum() / list.count()
}

val fun1Anonym = fun(list: List<Int>): Int {
    require(list.isNotEmpty())
    return list.sum() / list.count()
}

val fun1LambdaWithType: (List<Int>) -> Int = { a ->
    a.sum() / a.count()
}

val fun1LambdaNoType = { a: List<Int> ->
    a.sum() / a.count()
}


