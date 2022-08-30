
class Person(val firstName: String = "Peter", val lastName: String = "Parker") {

    var nickName: String? = null
        set(value) {
            field = value
            println("The new nickname is $value")
        }
        get() {
            println("The return value is $field")
            return field
        }
}