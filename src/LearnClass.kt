import java.util.*
import kotlin.reflect.jvm.internal.impl.javax.inject.Inject

/**
 * Created by hanks on 15-11-10.
 */
class Person {

}

class Empty {

}

class Student constructor(age: String) {

}

class Teacher(name: String) {

}

class Customer(name: String) {
    init {
        print("Init class with name $name")
    }
}

class Customer2(name: String) {
    val cumtomKey = name.toUpperCase()
}

//constructor
class Peo(val firstName: String, val lastName: String, var atg: Int) {

}

class Peo2 public @Inject constructor(name: String) {

}

////// Secondary constructors

// which are prefixed with constructor
class Person2 {

    var children =  ArrayList<Person2>()

    constructor(name: String) {
    }

    constructor(name: String, parent: Person2) : this(name) {
        parent.children.add(this)
    }

}

//private
class DontCreateMe private constructor() {
}

class Customer3(val customerName: String = "")

val customer = Customer3("Joe Smith")