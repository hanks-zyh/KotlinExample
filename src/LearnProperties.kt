/**
 * Created by hanks on 15-11-25.
 */

public class Address {

    public var name: String ? = ""
    public var street: String = ""
    public var city: String = ""
    public var state: String = ""

    // getter setter
    var zip: String = ""
        get() = field
        set(value) {
            if (value.length > 0) {
                 field = "$value.zip"
            }
        }

    // getter
    val isEmpty: Boolean
        get() = this.name.isNullOrEmpty()


}

fun cpoyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.street = address.street
    result.city = address.city
    result.state = address.state
    result.zip = address.zip
    return result
}


fun main(args: Array<String>) {

    val address = Address()
    println(address.isEmpty) // true
    //    address.isEmpty = false // compile error
    address.name = "hanks"
    println(address.isEmpty) // false

    address.zip = "info"
    println(address.zip) //info.zip
}