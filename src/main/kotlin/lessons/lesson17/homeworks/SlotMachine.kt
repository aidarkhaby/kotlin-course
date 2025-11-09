package org.example.lessons.lesson17.homeworks

import jdk.jfr.DataAmount

class SlotMachine {
    val color: String = "Red"
    val model: String = "Leviathan"
    private var isPowerOn: Boolean = false
    private var isOSLoaded: Boolean = false
    private val installedGames: MutableList<String> = mutableListOf("Poker", "Black jack", "21", "roulette",)
    val hasJoystick: Boolean = true
    private var balance: Double = 0.0
    private var owner: String = "John Smith"
    val supportPhone: String = "+8 800 555 35 35"
    private var isSessionPaid: Boolean = false
    private val sessionCost: Double = 50.0
    private val pinCode: String = "8714"

    fun turnOn(){
        isPowerOn = true
        downloadOs()
    }

    fun turnOff(){
        isPowerOn = false
        shutDownOs()
    }

   private fun downloadOs(){
       println("ОС загружена")
        isOSLoaded = true
    }

   private fun shutDownOs(){
       println("Работа ОС завершена")
       isOSLoaded = false
    }

    fun showGamesList(){
        println("Список доступных игр: $installedGames")
    }

    fun turnOnGame(gameName: String){
        if (isSessionPaid == false){
            println("Оплати игру прежде чем начать")
            return
        }
        if (installedGames.contains(gameName)){
            println("Игра '$gameName' запущена" )
        }
        else{
            println("Игра '$gameName' не найдена")
        }
    }

    fun payForGamingSession(){
        balance += sessionCost
        isSessionPaid = true
    }

    fun withdrawCash(pin: String): Double{
        if (pin != this.pinCode){
            println("Пин код неверный!")
            return 0.0
        }
        return cashOut()
    }

    private fun cashOut(): Double{
        val withDraw = balance
        balance = 0.0
        return withDraw
    }
}