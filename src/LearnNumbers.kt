/**
 * Created by hanks on 15-10-28.
 */
fun main(args: Array<String>) {
    val a = 2.3
    val b = 2.3F
    val c = 2
    val d = 2L
    val e = 0x2a
    val f = false
    val g = 0b01010

    println("$a , $b , $c , $d , $e , $f , $g")

    val aa: Int = 1000
    println(aa == aa) //true
    println(aa === aa) //true
    val boxedA: Int? = aa
    val anotherBoxedA: Int? = aa
    println(boxedA == anotherBoxedA) //true
    println(boxedA === anotherBoxedA) //false


    val bb: Int? = 1
    val cc: Long? = bb?.toLong()

    println(cc)

}