package org.example.lessons.lesson16.homeworks.Logger

class Logger {

    fun log(message: String){
        println("INFO: $message")
    }

    fun log(levelLog: String, message: String){
        if(levelLog == "WARNING"){
            println("\u001b[43m $levelLog : $message \u001B[0m")
        }
        else if (levelLog == "ERROR"){
            println("\u001b[37;41m $levelLog : $message \u001B[0m")
        }
    }

    fun log(messages: List<String>) {
        messages.forEach { message ->
            println("INFO: $message")
        }
    }
}