
fun sayHello(greeting:String, itemToGreet:List<String>) {
    itemToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}


fun main() {
    val interestingThings = mutableListOf("Kotlin", "Programming", "Comic Books")
    sayHello("Hi", interestingThings)
}

