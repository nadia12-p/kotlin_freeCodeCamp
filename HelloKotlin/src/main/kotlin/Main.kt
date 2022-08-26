

val name = "Nate"
var greeting: String? = null

fun main() {
    greeting = "hello"
    val greetingToPrint = when (greeting) {
        null -> "Hi"
        else -> greeting
    }
    println(greetingToPrint)
    println(name);
}



