abstract class Animal(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan!")
    }

    fun sleep(){
        println("$name sedang tidur!")
    }
}

fun main() {
    val animal = Animal()
    animal.age = 10
    println()
}