/**
 * Created by hanks on 15-10-28.
 */
fun main(args: Array<String>) {
    val input1 = "23"
    val input2 = "32"
    val x = parseInt(input1)
    val y = parseInt(input2)

    // 直接使用 `x * y` 可能会报错，因为他们可能为 null
    if (x != null && y != null) {
        // 在空指针判断后，x 和 y 会自动变成非空(non-nullable)值
        print(x * y)
    } else {
        print("your get wrong number")
    }


    val xx = parseInt(input1)
    val yy = parseInt(input2)

    if (xx == null) {
        print("input1 is wrong number")
        return
    }
    if (yy == null) {
        print("input2 is wrong number")
        return
    }
    //不判读xx和yy是否为空直接调用的话编译器报错
    print(xx * yy)
}

fun parseInt(str: String): Int? {
    return null
}
