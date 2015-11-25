/**
 * Created by hanks on 15-11-25.
 */

/*
Classes and Interfaces

When declared inside a class:

        private means visible inside this class only (including all its members);
protected — same as private + visible in subclasses too;
internal — any client inside this module who sees the declaring class sees its internal members;
public — any client who sees the declaring class sees its public members.
NOTE for Java users: outer class does not see private members of its inner classes in Kotlin.

*/

open class Outer {
    private val a = 1
    protected val b = 2
    internal val c = 4
    val d = 5 // public by default

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a is not visible
    // b, c is visible
    // Nested and e is visible

    fun info() {
        println(b) // 2
        println(c) // 4
        println(Nested::class.java) //class Outer$Nested
        println(Nested().e) // 5
    }
}


class Unrelated(o: Outer) {
    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either

    val c = o.c;
    val d = o.d;
    fun info() {
        println(c)
        println(d)

    }

}

fun main(args: Array<String>) {
    val sub = Subclass()
    sub.info()
    Unrelated(sub).info()
}