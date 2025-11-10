package org.example.lessons.lesson18.homeworks

import java.io.InputStream

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}

abstract class Refrigerator: Powerable, Openable, TemperatureRegulatable
abstract class WashingMachine: Powerable, Openable, TemperatureRegulatable, WaterContainer, WaterConnection, Drainable
abstract class SmartLamp: Powerable, Timable, LightEmitting, Programmable
abstract class DigitalClock: Powerable, Timable
abstract class RobotVacuumCleaner: Powerable, WaterContainer, AutomaticShutdown, Timable, SoundEmitting, Movable, Cleanable, Rechargeable
abstract class MechanicalClock: Timable, Mechanical
abstract class FlashLight: Powerable, BatteryOperated, LightEmitting
abstract class CoffeeMachine: Powerable, WaterContainer, TemperatureRegulatable, AutomaticShutdown, Cleanable
abstract class SmartSpeaker: Powerable, Timable, SoundEmitting

abstract class PowerableEquipment: Powerable{
    protected var isPoweredOn: Boolean = false
    override fun powerOn(){
        println("Включилось")
        isPoweredOn = true
    }

    override fun powerOff(){
        println("Выключилось")
        isPoweredOn = false
    }

    protected fun checkPower(): Boolean {
        if (!isPoweredOn) {
            println("Ошибка: устройство выключено. Включите питание.")
            return false
        }
        return true
    }
}

abstract class ProgrammableEquipment: PowerableEquipment(), Programmable{
    protected val programs = mutableListOf<String>()

    override fun programAction(action: String){
        if (checkPower()){
            programs.add(action)
            println("Программа добавлена: $action")
        }
    }

    override fun execute(){
        if (checkPower()){
            println("Выполнение программ: ${programs.joinToString()}")
        }
    }
}

abstract class TemperatureOpenableEquipment: TemperatureRegulatable, Openable, ProgrammableEquipment(){
    protected var currentTemperature: Int = 0
    protected var isOpened: Boolean = false

    override fun setTemperature(temp: Int){
        if(checkPower()){
            if(temp <= maxTemperature){
                currentTemperature = temp
                println("Температура установлена: $temp°C")
            } else {
                println("Ошибка: температура $temp превышает максимальную $maxTemperature°C")
            }
        }
    }

    override fun open() {
        isOpened = true
        println("Открылось")
    }
    override fun close(){
        isOpened = false
        println("Закрылось")
    }
}

class RefrigeratorImpl : TemperatureOpenableEquipment() {
    override val maxTemperature: Int = 5

    fun getCurrentTemp(): Int {
        return currentTemperature
    }
}

class WashingMachineImpl : TemperatureOpenableEquipment(), WaterContainer, WaterConnection, Drainable {
    override val maxTemperature: Int = 90
    override val capacity: Int = 50
    private var waterLevel: Int = 0
    private var isConnectedToWater: Boolean = false
    private var isConnectedToDrain: Boolean = false

    override fun fillWater(amount: Int) {
        if (checkPower()) {
            if (waterLevel + amount <= capacity) {
                waterLevel += amount
                println("Добавлено $amount л воды. Уровень: $waterLevel/$capacity")
            } else {
                println("Ошибка: превышена емкость $capacity л")
            }
        }
    }

    override fun getWater(amount: Int) {
        if (checkPower()) {
            if (waterLevel >= amount) {
                waterLevel -= amount
                println("Забрано $amount л воды. Уровень: $waterLevel/$capacity")
            } else {
                println("Ошибка: недостаточно воды")
            }
        }
    }

    override fun connectToWaterSupply() {
        isConnectedToWater = true
        println("Подключено к водоснабжению")
    }

    override fun connectToDrain() {
        isConnectedToDrain = true
        println("Подключено к сливу")
    }

    override fun drain() {
        if (checkPower() && isConnectedToDrain) {
            waterLevel = 0
            println("Вода слита")
        } else {
            println("Ошибка: не подключено к сливу")
        }
    }
}

class KettleImpl : TemperatureOpenableEquipment(), WaterContainer {
    override val maxTemperature: Int = 100
    override val capacity: Int = 2
    private var waterLevel: Int = 0

    override fun fillWater(amount: Int) {
        if (waterLevel + amount <= capacity) {
            waterLevel += amount
            println("Чайник наполнен на $amount л. Уровень: $waterLevel/$capacity")
        } else {
            println("Ошибка: превышена емкость $capacity л")
        }
    }

    override fun getWater(amount: Int) {
        if (waterLevel >= amount) {
            waterLevel -= amount
            println("Из чайника взято $amount л воды. Уровень: $waterLevel/$capacity")
        } else {
            println("Ошибка: недостаточно воды")
        }
    }

    fun boil() {
        if (checkPower() && waterLevel > 0) {
            setTemperature(100)
            println("Чайник кипятит воду...")
        } else {
            println("Ошибка: нет воды или питание выключено")
        }
    }
}

class OvenImpl : TemperatureOpenableEquipment() {
    override val maxTemperature: Int = 250

    fun bake(dish: String, time: Int) {
        if (checkPower()) {
            println("Приготовление $dish при $currentTemperature°C в течение $time минут")
        }
    }
}

fun main() {
    println("=== ДЕМОНСТРАЦИЯ РАБОТЫ УСТРОЙСТВ ===\n")

    // Холодильник
    println("1. ХОЛОДИЛЬНИК:")
    val fridge = RefrigeratorImpl()
    fridge.powerOn()
    fridge.setTemperature(4)
    fridge.programAction("Охлаждение")
    fridge.execute()
    println("Текущая температура: ${fridge.getCurrentTemp()}°C\n")

    // Стиральная машина
    println("2. СТИРАЛЬНАЯ МАШИНА:")
    val washer = WashingMachineImpl()
    washer.powerOn()
    washer.connectToWaterSupply()
    washer.connectToDrain()
    washer.fillWater(30)
    washer.setTemperature(40)
    washer.programAction("Хлопок")
    washer.programAction("Полоскание")
    washer.execute()
    washer.drain()
    println()

    // Чайник
    println("3. ЧАЙНИК:")
    val kettle = KettleImpl()
    kettle.powerOn()
    kettle.fillWater(1)
    kettle.setTemperature(100)
    kettle.boil()
    kettle.getWater(1)
    println()

    // Духовка
    println("4. ДУХОВКА:")
    val oven = OvenImpl()
    // Попробуем установить температуру без включения
    oven.setTemperature(180) // Должна быть ошибка
    oven.powerOn()
    oven.setTemperature(180)
    oven.bake("пирог", 45)
    oven.programAction("Выпечка")
    oven.execute()

    println("\n=== ПРОВЕРКА ОШИБОК ===")
    val testFridge = RefrigeratorImpl()
    testFridge.setTemperature(5) // Ошибка - не включен
    testFridge.open() // Должно работать даже выключенным
}













