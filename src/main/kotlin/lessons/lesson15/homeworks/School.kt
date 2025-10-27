package org.example.lessons.lesson15.homeworks

class School(
    address: String,
    lessons: List<String>,
    val schoolkid: List<String>,
    val shift: Int
): EducationalInstitution(address, lessons) {
}