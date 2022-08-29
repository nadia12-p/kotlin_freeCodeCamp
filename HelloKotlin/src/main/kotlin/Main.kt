
fun sayHello(greeting:String, vararg itemToGreet:String) {
    itemToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

fun main() {
    greetPerson(name = "Nadia")
}

