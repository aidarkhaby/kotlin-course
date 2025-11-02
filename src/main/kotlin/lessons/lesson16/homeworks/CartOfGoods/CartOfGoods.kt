package org.example.lessons.lesson16.homeworks.CartOfGoods

class CartOfGoods(val mapOfGoods: MutableMap<String, Int>) {

    fun addToCart(itemId: String){
        mapOfGoods[itemId] = 1
    }

    fun addToCart(itemId: String, amount: Int){
        mapOfGoods[itemId] = amount
    }

    fun addToCart(map: Map<String, Int>){
        mapOfGoods.putAll(map)
    }

    fun addToCart(listOfIds: List<String>){
        listOfIds.forEach {
            mapOfGoods.put(it, 1)
        }
    }

    override fun toString(): String {
        val countId = mapOfGoods.size
        val countAmount = mapOfGoods.values.sum()
        val list = mapOfGoods.map { "Артикул: ${it.key} Количество: ${it.value}" }
            .joinToString("\n")
        return list + "\nВсего артикулов: $countId\nВсего товаров: $countAmount\n"
    }
}