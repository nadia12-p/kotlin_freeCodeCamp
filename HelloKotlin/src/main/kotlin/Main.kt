
fun sayHello(greeting:String, vararg itemToGreet:String) {
    itemToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}


fun main() {
    val interestingThings = mutableListOf("Kotlin", "Programming", "Comic Books")
    sayHello("Hi", "Kotlin", "Programming", "Comic Books")
}

