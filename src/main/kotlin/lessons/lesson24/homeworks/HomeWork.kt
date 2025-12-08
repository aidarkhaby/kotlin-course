package org.example.lessons.lesson24.homeworks

fun ex1(arg: Boolean, fnc: (String) -> Unit): Int {
    return 1
}

fun Int.ex2(fnc: Int.(String) -> List<String>): List<String> {
    return listOf("asd")
}

fun <A, E> A.ex3(fnc: A.() -> E): E {
    return fnc()
}

fun ex4(name: String): () -> String {
    val fnc: () -> String = { name }
    return fnc
}

fun <A> A.ex5(): (String) -> A {
    val fnc: (String) -> A = { this }
    return fnc
}