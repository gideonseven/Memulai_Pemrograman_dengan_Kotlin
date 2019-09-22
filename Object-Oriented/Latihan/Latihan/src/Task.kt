// TODO 1
class Latest(pgetter: String, psetter: String) {

    val getter: String
    val setter: String

    init {
        getter = pgetter
        setter = psetter
    }

}

class Cat(private val name: String) {
    var sleep: Boolean = false
    val latest = Latest("Fungsi getter dipanggil", "Fungsi setter dipanggil")


    fun toSleep() {
        if (!sleep) println("$name, let's play!") else println("$name, sleep!")
    }

    fun panggilGetter() {
        println(latest.getter)
    }

    fun panggilSetter() {
        println(latest.setter)
    }

}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")
    gippy.panggilGetter()
    gippy.toSleep()
    gippy.panggilSetter()
    gippy.panggilGetter()
    gippy.sleep = true
    gippy.toSleep()
}