

val name = "Nate"
var greeting: String? = null

fun main() {
    greeting = "hello"
    val greetingToPrint = if(greeting != null) greeting else "Hi"
    println(greetingToPrint)
    println(name);
}



