package org.example.lessons.lesson14.homeworks

data class Product(val name: String, val price: Int, val quantity: Int)
fun main(){
    val product1 = Product("банан", 60, 4)
    println(product1)
}