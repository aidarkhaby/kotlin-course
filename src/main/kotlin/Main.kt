package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
    println("Цикл for от 1 до 10:")
    for (i in 1..10) {
        print("$i ")
    }
    var simpleString = "Я не уверен, это невозможно сделать катастрофа без проблем"
    fun fun1(arg: String) {
        val result = when {
            arg.contains("невозможно") -> arg.replace("невозможно", "совершенно точно возможно, просто требует времени")

            arg.startsWith("Я не уверен") -> arg.plus(", но моя интуиция говорит об обратном")

            arg.contains("катастрофа") -> arg.replace("катастрофа", "интересное событие")

            arg.endsWith("без проблем") -> arg.replace("без проблем", "с парой интересных вызовов на пути")

            !arg.contains(" ") -> "Иногда, $arg, но не всегда"

            else -> arg
        }
        println(result)
    }
    fun1(simpleString)


}