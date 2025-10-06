package org.example.lessons.lesson08.homeworks

class HomeWork {
    //Если фраза содержит слово "невозможно":
    //Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".
    val simpleString = "Это невозможно сделать"
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

    //У вас есть строка лога, например "Пользователь вошел в систему -> 2021-12-01 09:48:23" (данные могут быть любыми, но формат всегда такой).
// Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди. Используй indexOf или split для получения правой части сообщения.
    fun fun2(arg: String){
        val date = arg.split("->")
        val dateAndTime = date[1].split(" ")
        println(dateAndTime[1])
        println(dateAndTime[2])
    }

//Дана строка с номером кредитной карты, например "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".
fun fun3(arg: String){
    val sub1 = arg.substring(15)
    println("**** **** **** $sub1")
}

    //У вас есть электронный адрес, например "username@example.com". Преобразуйте его
    // в строку "username [at] example [dot] com", используя функцию replace()
    fun fun4(arg: String){
        val email = arg.replace("@"," [at] ").replace("."," [dot] ")
        println(email)
    }

    //Дан путь к файлу, например "C:/Пользователи/Документы/report.txt" или "D:/good.themes/dracula.theme" (может быть любым).
    // Извлеките название файла с расширением.
    fun fun5(arg: String){
        val splittedText = arg.split("/")
        println(splittedText.last())
    }

    //У вас есть фраза, например "Котлин лучший язык программирования" (может быть любой с разделителями слов - пробел).
    // Создайте аббревиатуру из начальных букв слов (например, "ООП").
    fun fun6(arg: String){
        val splittedText = arg.split(" ")
        var counter = ""
        for (i in 0..splittedText.size - 1){
            counter += splittedText[i][0]
        }
        println(counter.uppercase())
    }
}