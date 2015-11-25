/**
 * Created by hanks on 15-11-25.
 */
interface MyInterface {
    var property: Int
    fun bar()
    fun foo() {
        print("foo: $property")
    }
}

class Child : MyInterface {
    override var property: Int = 29 // have to implement
    override fun bar() {
        print("bar have to implement")
    }
}

interface A {
    fun foo() {
        print("A.foo()")
    }

    fun bar()
}

interface B {
    fun foo() {
        print("B.foo()")
    }

    fun bar() {
        print("B.bar()")
    }
}

class C : A {
    override fun bar() {
        print("have to implement")
    }
}

/*
class D : A, B {

    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

}*/
