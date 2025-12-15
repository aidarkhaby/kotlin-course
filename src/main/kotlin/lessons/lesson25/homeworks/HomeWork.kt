package org.example.lessons.lesson25.homeworks

class Person(val name: String, val age: Int) {
    var email: String = ""
}

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}

val employee1 = Employee("Сидоров", 27, "менеджер").apply {
    email = "ivan@gm.com"
    department = "dep1"
}