fun main(){
    val section = arrayListOf("Sec A ","Sec B ","Sec C ","Sec D ","Sec E ","Sec F ","Sec G ","Sec H ")
    val food = hashMapOf(1 to " Milk", 2 to " Banana", 3 to " Chocolate")
    food[4]= " Biriyani"
    food.put(5,"Rice")

    //For
    for(x in section){
        println(x)
    }

    for((key,value) in food){
        println("$key $value")
    }

    //While
    var x = 5
    while(x>0){
        println(x)
        x--
    }

}