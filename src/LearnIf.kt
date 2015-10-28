/**
 * Created by hanks on 15-10-28.
 */

fun main(args: Array<String>) {
    println("max(2,3) = ${max(2, 3)}")
    println("min(32,55) = ${min(32f, 35f)}")
}

fun max(a: Int, b: Int): Int {
    if (a > b) return a
    else return b
}

fun min(a: Float, b: Float): Float = if (a > b) b else a