import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.*

/**
 * Created by hanks on 15-11-4.
 */

fun main(args: Array<String>) {
    var nameList: ArrayList<String> = ArrayList()
    nameList.add("check")
    nameList.add("SSlack")
    nameList.add("LearnCollections.kt")
    nameList.add("StringArray")
    nameList.add("java")
    nameList.add("Student")
    nameList.add("java")

    for(name in nameList) println(name)

    println("java" in nameList)

    nameList
            .filter { it.startsWith("S") }
            .sortedBy { it.length }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}