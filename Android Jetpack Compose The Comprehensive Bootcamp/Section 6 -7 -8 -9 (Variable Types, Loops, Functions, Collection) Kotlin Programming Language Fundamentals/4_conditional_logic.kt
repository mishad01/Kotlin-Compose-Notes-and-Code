fun main() {
    val number = 10
 //Way 1
    if (number > 5) {
        println("Number is greater than 5")
    } else if (number == 5) {
        println("Number is 5")
    } else {
        println("Number is less than 5")
    }

 //Way 2
    val result = if (number > 5) {
        println("Number is greater than 5")
    } else if (number == 5) {
        println("Number is 5")
    } else {
        println("Number is less than 5")
    }

 //Way 3
    val day = 5
    when(day){
        1-> println("Saturday")
        2-> println("Sunday")
        3-> println("Monday")
        else -> println("Invalid")
    }

    //Way 4
    val day2 = 5
    when(day2){
        1,2,3-> println("Saturday")
        4,5,6-> println("Sunday")
        7,8,9-> println("Monday")
        else -> println("Invalid")
    }
    //Way 5

    val x = 5
    val y = 10

    when {
        x > y -> println("x is greater than y")
        x < y -> println("x is less than y")
        else -> println("x and y are equal")
    }
    //Way 6
    val a = 5
    val b = 6
    val c = 10
    val max = if(a>b) a else b

    //Way 7
    if (a > 0 && b > 0) {
        println("Both a and b are positive")
    } else {
        println("One or both are non-positive")
    }

    //Way 7
    if ((a > 0 && b > 0) || c > 0) {
        println("Either both a and b are positive, or c is positive")
    } else {
        println("Condition not met")
    }

    //Way 8
    if (!(a > 0)) {
        println("a is not positive")
    } else {
        println("a is positive")
    }

    var x1 = 10
    var x2 = 20
    var res =if (x1<x2) "One Big" else "Two Big"

}