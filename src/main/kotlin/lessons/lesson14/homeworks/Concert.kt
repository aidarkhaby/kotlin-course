package org.example.lessons.lesson14.homeworks

class Concert(val group: String, val place: String, val price: Int, val capacity: Int){

    private var soldTickets: Int = 0

    fun showInfo(){
        println("Сегодня выступает группа $group. Место проведения концерта - $place. Цена билета - $price. Вместимость зала - $capacity")
    }

    fun buyTicket(){
        if (soldTickets < capacity){
            soldTickets++
            println("Вы купили билет")
        }
        else {
            println("Билеты распроданы. У нас sold out")
        }
    }

    fun main(){
        val concert = Concert("Backstreet Boys", "Crocus city hall", 3000, 1500)
    }
}