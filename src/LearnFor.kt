import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.*

/**
 * Created by hanks on 15-10-28.
 */
fun main(args: Array<String>) {

    var names = StringArray()
    names.add("Bob")
    names.add("Marry")
    names.add("Fish")
    names.add("Cat")
    names.add("Dog")

    for(i in 0..names.size-1){
        print("${names[i]} " )
    }
    //Bob Marry Fish Cat Dog

    println()

    var cityList = ArrayList<String>()
    cityList.add("beijing")
    cityList.add("shanghai")
    cityList.add("hangzhou")
    cityList.add("shenzhen")

    for(city in cityList){
        print("$city ")
    }
    for(i in cityList.indices){
        print("${cityList[i]} ")
    }
    //beijing shanghai hangzhou shenzhen


    for((index, value) in cityList.withIndex()){
        println("the element at $index is $value")
    }
    //    the element at 1 is shanghai
    //    the element at 2 is hangzhou
    //    the element at 3 is shenzhen


    mymark@ for(i in 1..100){
        for(j in 1..100){
            if(i ==5 && j ==5){
                break@mymark
            }
        }
    }
}