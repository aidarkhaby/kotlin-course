package org.example.lessons.lesson29.homeworks

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

data class Employee(
    val name: String,
    val jobStatus: Boolean,
    val birthDate: String,
    val jobTitle: CharacterTypes,
    val subordinates: List<Employee> = emptyList()
)

enum class CharacterTypes {
    CTO,
    UX_UI,
    CRM, // Customer Relationship Manager
    FRONTEND_DEV,
    TEAM_LEAD,
    BACKEND_DEV,
    PM,
    SYSADMIN,
    QA
}

fun main() {
    val teamLeadFront = Employee(
        "Марк",
        true,
        "01.01.1990",
        CharacterTypes.TEAM_LEAD,
        listOf(
            Employee(
                "Алексей",
                true,
                "10.10.2000",
                CharacterTypes.UX_UI
            ),
            Employee(
                "Валерия",
                true,
                "01.01.1990",
                CharacterTypes.FRONTEND_DEV
            ),
            Employee(
                "Айдар",
                true,
                "20.05.1998",
                CharacterTypes.QA
            )
        )
    )

    val teamLeadBack = Employee(
        "Андрей",
        true,
        "01.02.1990",
        CharacterTypes.TEAM_LEAD,
        listOf(
            Employee(
                "Алла",
                true,
                "10.11.2000",
                CharacterTypes.BACKEND_DEV
            ),
            Employee(
                "Мария",
                true,
                "01.05.1993",
                CharacterTypes.SYSADMIN
            ),
            Employee(
                "Кирилл",
                true,
                "01.09.1993",
                CharacterTypes.QA
            )
        )
    )

    val productManager = Employee(
        "Олег",
        true,
        "19.03.1990",
        CharacterTypes.PM,
        listOf(teamLeadFront, teamLeadBack)
    )

    val cto = Employee(
        "Илья",
        true,
        "17.08.1980",
        CharacterTypes.CTO,
        listOf(
            productManager, Employee(
                "Татьяна",
                true,
                "19.02.1996",
                CharacterTypes.CRM
            )
        )
    )

    val gson = GsonBuilder()
        .setPrettyPrinting()
        .create()

    val json = gson.toJson(cto)
    println(json)
    val fileCto = File("/Users/aidarkhabibulin/IdeaProjects/kotlin-course/src/main/kotlin/lessons/lesson29/homeworks/cto.json")
    with(fileCto) {
        writeText(json)
    }

    deserialized()
}

fun deserialized(){
    val gson = Gson()
    val fileCto = File("/Users/aidarkhabibulin/IdeaProjects/kotlin-course/src/main/kotlin/lessons/lesson29/homeworks/cto.json")
    val objectCto = gson.fromJson(fileCto.readText(), Employee::class.java)
    println(objectCto)
}

