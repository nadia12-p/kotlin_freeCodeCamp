
class Person(val firstName: String, val lastName: String) {

    init {
        println("init 1")
    }
    constructor(): this("Peter", "Parker") {
        println("Secondary constructor")
    }
    init {
        println("init 2")
    }
}