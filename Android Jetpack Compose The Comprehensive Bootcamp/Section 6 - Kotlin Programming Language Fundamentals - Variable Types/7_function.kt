fun name() {
    println("Mishad")
}

fun userName(name : String) : String{
    return name;
}

fun sum(a: Int, b : Int) : Int{
    return a+b;
}

fun mood(mood : String = "Angry"){
    println(mood);
}
fun main() {
    name()
    println(userName("Mishad"))
    println(sum(2,3));
    mood()
    mood("AAAAAA")
    mood("Hehehe")
}