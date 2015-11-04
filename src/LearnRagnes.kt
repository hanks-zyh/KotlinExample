/**
 * Created by hanks on 15-11-4.
 */

fun main(args: Array<String>) {
    checkRange(2, 5)
    checkRange(5, 5)
    checkRange(1, 5)
    checkRange(6, 5)
    checkRange(0, 5)

    var array: IntArray = intArrayOf(1, 2, 3, 4, 5)
    checkRange2(0, array)
    checkRange2(4, array)
    checkRange2(5, array)
    checkRange2(6, array)
}

fun checkRange(x: Int, y: Int) {
    if (x in 1..y) {
        println("Yes")
    } else {
        println("No")
    }
}

fun checkRange2(x: Int, array: IntArray) {
    if (x !in 0..array.lastIndex) {
        println("Out")
    } else {
        println("In")
    }
}