fun main(){
    val str = "Hello World Its Me"
    val str2 = "Hello World \nIts Me"
    val test = """|A long time AGO
        |IN A GALAXY
        |FAR FAR AWAY
        |ALSDKJFSD""".trimMargin()

    val test2 = """>A long time AGO
        >IN A GALAXY
        >FAR FAR AWAY
        >ALSDKJFSD""".trimMargin(marginPrefix = ">")

    /*for(char in str){
        println(char)
    }
*/
    val checkStr = str.contentEquals("Hello World It Me");
    val checkStr2 = str.contains("Itss")

    val upperCase = str.uppercase()
    val lowerCase = str.lowercase()


    val num = 6
    val  stringNum = num.toString()

    val subsequence = str.subSequence(0,5)
    println(subsequence)

    val luke = "Luke Skywalker"
    val tightSaberColor =  "green"
    val vehicle = "tandspeeder"

    println("$luke has $tightSaberColor lightsaber and drives $vehicle")
    print("${luke.uppercase()} has ${tightSaberColor.uppercase()} lightsaber and drives $vehicle")

//    println(test2)
}