package org.example.lessons.lesson15.homeworks

class Faculties(
    address: String,
    lessons: List<String>,
    students: List<String>,
    lecturers: List<String>,
    val speciality: String
): University(address, lessons, students, lecturers) {
}