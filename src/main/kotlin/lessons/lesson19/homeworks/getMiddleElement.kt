package org.example.lessons.lesson19.homeworks

fun <T> getMiddleElement(list: List<T>): T? {
    if (list.size % 2 == 0){
        return null
    }
    return list.getOrNull(list.size / 2)
}

fun main(){
    println(getMiddleElement(listOf("0", "b", "middle_element", "d", "19999")))
}