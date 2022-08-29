
fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")


fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic books")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    interestingThings.forEach {interestingThing ->
        println(interestingThing)
    }
}

