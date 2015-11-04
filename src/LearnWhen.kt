/**
 * Created by hanks on 15-11-4.
 */

fun main(args: Array<String>) {
    cases(20L)
    cases(1)
    cases(1.2F)
    cases("Hello")
    cases("Hell")
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greet")
        is Long -> println("Long")
        !is String -> println("NotString")
        else -> println("Unknown")
    }
}