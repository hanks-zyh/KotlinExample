/**
 * Created by hanks on 16/3/15.
 */
class Utils{
    companion object{}
}

fun Utils.Companion.getName() = " Utils: $this.javaClass.name" //


fun main(args: Array<String>) {
    println(Utils.getName())
    println(Utils().count())
}