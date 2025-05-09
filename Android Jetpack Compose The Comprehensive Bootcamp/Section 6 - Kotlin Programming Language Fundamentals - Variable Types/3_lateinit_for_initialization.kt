
lateinit var f :String  // Declaration without initialization

var g : String = "Test"

class Person{
    lateinit var name :String

    fun inputName(){
        name = "Sakif"
    }

    /* :: operator is known as the callable reference operator.
    It is used to obtain a reference to a function, property, or constructor.
    This feature is part of Kotlin's reflection capabilities and can be very useful in various scenarios,
    such as passing functions as parameters, creating function references, and accessing properties dynamically.*/

    fun printName(){
        if (::name.isInitialized){
            println("Name is $name")
        }else{
            println("Name is not initialized")
        }
    }
}
class Check {
    var name: String = "Unknown"
}
fun main(){
    lateinit var name : String

    val a: String = "World"    // String variable
    val b: Int = 10            // Integer variable
    val c: Boolean = false     // Boolean variable
    val d: Float = 0.0f        // Float variable
    val e: Double = 10.91
    print(g)

    val person = Person();
    val checkName = person.name;

}