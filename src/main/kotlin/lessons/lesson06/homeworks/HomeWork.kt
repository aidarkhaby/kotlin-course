package org.example.lessons.lesson06.homeworks

class HomeWork {

    fun seasonDefine (month: Int){
        when(month){
            in  1..2 -> println("Зима")
            in  3..5 -> println("Весна")
            in  6..8 -> println("Лето")
            in  9..11 -> println("Осень")
            12 -> println("Зима")
            else -> println("Некорректно задан месяц")
        }
    }

    fun dogAgeCountInHumahAge (age: Int){
        if (age in 0..2){
            println("Возраст собаки в человеческих годах = " + age * 10.5)
        }
        else {
            println("Возраст собаки в человеческих годах = " + (21 + (age - 2) * 4))
        }
    }

    fun chooseBetterWay (distance: Double){
        if (distance in 0.0..1.0){
            println("Иди пешком")
        }
        else if (distance in 1.0..5.0){
            println("Езжай на велосипеде")
        }
        else {
            println("Езжай на автотранспорте")
        }
    }

    fun bonusCount (arg: Int){
        if (arg in 0..1000){
            println("Ваш баланс бонусных баллов составляет " + ((arg / 100 ) * 2))
        }
        else {
            println("Ваш баланс бонусных баллов составляет " + ((arg / 100 ) * 3))
        }
    }

    fun defineFileType(arg: String){
        if (arg.equals("txt")){
            println("Это текстовый документ")
        }
        else if (arg.equals("img") or arg.equals("png")){
            println("Это изображение")
        }
        else if (arg.equals("xlsx") or arg.equals("csv")){
            println("Это таблица")
        }
        else {
            println("Это неизвестный тип")
        }
    }

    fun convertTemperature(temp: Double, arg2: Char){
        if (arg2 == 'C'){
            println("Температура " + temp + " градусов по цельсию равна температуре " + (temp * 1.8 + 32) + " градусов по фаренгейту")
        }
        else if(arg2 == 'F'){
            println("Температура " + temp + " градусов по фаренгейту равна температуре " + ((temp - 32) / 1.8) + " градусов по цельсию")
        }
    }

    fun recommendClothing(temperature: Int){
        when {
            temperature < -30 -> println("не выходить из дома")
            temperature < 10 -> println("куртка и шапка")
            temperature <= 18 -> println("ветровка")
            temperature <= 35 -> println("футболка и шорты")
            else -> println("не выходить из дома")
        }
    }

    fun getAvailableMovieCategories(age: Int){
        when{
            age < 0 -> println("Неверный возраст")
            age < 9 -> println("Вам доступны детские фильмы")
            age < 18 -> println("Вам доступны детские, подростковые фильмы")
            else -> println("Вам доступны детские, подростковые, 18+ фильмы")
        }
    }
}