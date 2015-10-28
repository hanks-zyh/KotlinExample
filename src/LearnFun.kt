/**
 * Created by hanks on 15-10-28.
 */

fun main(args: Array<String>) {
    print("2+3=")
    println(sum(2, 3))
    println("2-3=" + sub(2, 3))
    printSum(2,3)
}

fun sum(a: Int, b: Int): Int {
    return a + b;
}

fun sub(a: Int, b: Int) = a - b

fun printSum(a: Int, b: Int) {
    print(a + b)
}