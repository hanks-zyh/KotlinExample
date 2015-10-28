/**
 * Created by hanks on 15-10-28.
 */
fun main(args: Array<String>) {
    var obj = "hanks is learning kotlin"
    println("the length of '$obj' is ${getStringLength(obj)}")
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun getStringLength2(obj: Any): Int? {
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}

fun getStringLength3(obj: Any): Int? {
    if (obj !is String) {
        return null
    }
    return obj.length
}


