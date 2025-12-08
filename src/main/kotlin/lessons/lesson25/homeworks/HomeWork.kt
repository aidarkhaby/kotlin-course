package org.example.lessons.lesson25.homeworks

fun ex1(fnc: () -> Any): Long {
    val start = System.currentTimeMillis()
    fnc()
    return System.currentTimeMillis() - start
}

fun main() {
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }
    println(ex1(myFunction))

    val em = Employee("Ivan", 23, "QA Engineer").apply {
        email = "ivan@gm.com"
        department = "dep1"
    }

    val person1 = Person("Anna", 26).also {
        it.email = "anna@gm.com"
        printPerson(it)
    }

    val person2 = Person("Andrew", 32).apply {
        email = "andrew@gm.com"
    }
    val employee = with(person2) {
        Employee(name, age, "Front dev").also {
            it.email = email
            it.department = "dep2"
        }
    }

    val person3 = Person("Andrew", 32).apply {
        email = "andrew@gm.com"
    }

    val employee2 = person3.run {
        Employee(name, age, "Front dev").also {
            it.email = email
            it.department = "dep2"
        }
    }
}

class Person(val name: String, val age: Int) {
    var email: String = ""
}

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}


fun printPerson(person: Person) {
    with(person) {
        println("""
           Name: $name
           Age: $age
           Email: $email
       """.trimIndent())
    }
}