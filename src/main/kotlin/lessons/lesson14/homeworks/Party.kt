package org.example.lessons.lesson14.homeworks

class Party(val location: String, val attendees: Int) {
    fun details() {
        println("Место проведения: $location Количество гостей: $attendees")
    }
}