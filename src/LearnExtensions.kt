import java.util.*

/**
 * Created by hanks on 15-11-25.
 */

// Extension Function

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main(args: Array<String>) {


}