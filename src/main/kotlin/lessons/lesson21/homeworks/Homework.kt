package org.example.lessons.lesson21.homeworks

fun analyzeDataType(arg1: Any) {
    when (arg1) {
        is String -> println("Это строка: $arg1")
        is Number -> println("Это число: $arg1")
        is List<*> -> println("Это список, количество элементов: ${arg1.size}")
        is Map<*, *> -> println("Это словарь, количество пар: ${arg1.size}")
        else -> println("Неизвестный тип данных")
    }
}

fun safeCastToList(arg: Any): Int {
    val safeList: List<*>? = arg as? List<*> ?: return -1
    return (arg as? List<*>)?.size ?: -1
}

fun getStringLengthOrZero(arg: Any?): Int {
    return (arg as? String)?.length ?: 0
}

fun Any.toSquare(): Double {
    if (this is Int) {
        return (this * this).toDouble()
    } else if (this is Double) {
        return this * this
    } else if (this is String) {
        return this.toDouble() * this.toDouble()
    }
    return 0.0
}

fun sumIntOrDoubleValues(list: List<Any>): Double {
    return list.filter { it is Int || it is Double }.map { (it as Number).toDouble()}.sum()
}

fun tryCastToListAndPrint(arg: Any){
    val result = (arg as? List<*>)?.map { (it as? String) ?: "Элемент не является строкой" } ?: "Не удалось преобразовать аргумент в список"
    println(result)
}

