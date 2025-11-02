package org.example.lessons.lesson15.homeworks

open class University(
    address: String,
    lessons: List<String>,
    val students: List<String>,
    val lecturers: List<String>
): EducationalInstitution(address, lessons) {
}