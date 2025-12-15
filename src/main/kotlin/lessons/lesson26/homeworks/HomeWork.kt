package org.example.lessons.lesson26.homeworks

import java.io.File

fun main() {

    val fileEx1 = File("workspace/task1/example.txt")

    with(fileEx1) {
        parentFile?.mkdirs()
        createNewFile()
        writeText("Hello, Kotlin!")
        if (exists()) {
            println("Файл example.txt существует")
        } else {
            println("Файл не найден")
        }
    }

    val directoryEx2 = File("workspace/task2/testDir")
    with(directoryEx2) {
        mkdirs()
        if (isDirectory) {
            println("testDir является директорией")
        }
        println("Абсолютный путь до директории: ${absoluteFile}")
    }

    val directoryEx3 = File("workspace/task3/structure")
    with(directoryEx3) {
        mkdirs()
        resolve("myDir")
    }.apply {
        resolve("subDir1").mkdirs()
        resolve("subDir2").mkdirs()
        val files = list()
        if (files?.all { it.contains("subDir1") || it.contains("subDir2") } ?: false) {
            println("Директории найдены")
        } else {
            println("Директории не найдены в ${list().joinToString()}")
        }
    }

    val directoryEx4 = File("workspace/task4/temp")
    with(directoryEx4) {
        mkdirs()
        resolve("asdDir").mkdirs()
        resolve("123456").mkdirs()
        File("workspace/task4/temp/asdDir/text.txt").createNewFile()
        File("workspace/task4/temp/asdDir/LOL.txt").createNewFile()
    }
    if (File("workspace/task4").deleteRecursively()) {
        println("Директория и всё её содержимое удалено")
    } else {
        println("Не удалось удалить директорию")
    }


    with(File("workspace/task5/config/config.txt")) {
        parentFile?.mkdirs()
        createNewFile()
        listOf("param 1 = true", "param 2 = false").also {
            writeText("$it")
        }
        println(readText())
    }

    fun ex6() {
        File("workspace").apply {
            walk().groupBy { if (it.isDirectory) "dir" else "file" }
                .also {
                    println("Directories")
                    println(it["dir"]?.joinToString("\n"))
                    println("Files")
                    println(it["file"]?.joinToString("\n"))
                }
        }
    }

    fun ex7() {
        val phrase = "This is a README file."
        File("workspace/task7/docs/readme.md").apply {
            parentFile?.mkdirs()
            if (!this.exists()) {
                createNewFile()
                writeText(phrase)
            }
            check(readText() == phrase)
        }
    }


    ex6()
    ex7()
}