
fun sayHello(greeting:String, vararg itemToGreet:String) {
    itemToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String, name: String) = println("$greeting $name")

fun main() {
    greetPerson(name = "Nadia", greeting = "hi")
}

