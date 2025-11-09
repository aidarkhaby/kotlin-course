package org.example.lessons.lesson17.homeworks

abstract class BaseClass(
    // 1. объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    // В ChildrenClass используется одноимённое поле, но оно не является полем privateVal из BaseClass
    private val privateVal: String,
    // 2. объясни, почему это поле недоступно в main()
    // потому, что поля protected значит: Члены класса доступны внутри класса и в производных классах.
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"
    private var privateField = "6. нельзя изменить это поле из класса наследника"
    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }
    fun printText() {
        privatePrint()
    }
    // 7. объясни, почему эта функция не может быть публичной
    // 7. Нельзя сделать функцию публичной, так как она относится к классу protected, доступ к которому есть только из текущего класса и наследников.
    // Вне класса доступа нет
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }
    // 8. Распечатай getAll() и объясни, почему в поле "generate" другой текст
    // метод getAll() вызывается из наследника, а метод generate() переопределен в классе наследнике, значит будет вызываться переопределенный метод
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }
    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }
    // 9. объясни, почему эта функция не может быть публичной или protected
    // Функция возвращает private класс, доступ к которому есть только из текущего класса, поэтому функция не может быть публичной или protected
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass() {}

    private class PrivateClass() {}
}
class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // Потому как в наследуемом классе есть одноимённое публичное поле и доступно именно оно, а не этот аргумент
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {
    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // Дочерний класс наследует все функции родительского, а значит их можно вызывать из объектов дочернего класса

    // 12. проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    // Вызывается метод printText() из родительского класса. Переопределение метода privatePrint() не происходит, потому что метод не переопределен
    // в дочернем классе - нет ключевого слова override в сигнатуре метода.
    // Приватные функции и поля не переопрделяются так как их область видимости только внутри класса
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }
    override fun verifyPublicField(value: String): Boolean {
        return value.length < 100
    }
    fun setNewProtectedField(field: String){
        protectedField = field
    }
}
fun main(){
    val objectChildren = ChildrenClass("private","protected", "public")
    // 3
    objectChildren.publicField = "Антонио Бандерас"
    objectChildren.setNewProtectedField("Измененное через сеттер поле protectedField")
    println(objectChildren.getAll())
    objectChildren.printText()
}