fun main(){
    //Immutable Array/List
    val name = listOf("Sakif","Saif","Rahman","Mishad")
    println(name[2])
    println(name.last())
    println(name.contains("Sakiff"));
    println(name.sorted())
    println(name);

    //Mutable Array

    val section = arrayListOf("Sec A","Sec B","Sec C","Sec D")
    section.add("Sec E")
    println(section)
    section.add(0,"Best Sections")
    println(section.size)
    println(section)
    section.remove("Sec E")
    println(section.indexOf("Sec C"))
    println(section)

  /*  1. mapOf: Immutable Map: mapOf creates a read-only (immutable) map. Once created, you cannot modify (add, remove, or update) its entries.
    2. hashMapOf: Mutable Map: hashMapOf creates a mutable map, specifically a HashMap. You can modify (add, remove, or update) the key-value pairs after the map is created.*/

    //Map
    val rollName = mapOf(1 to "Mishad",2 to "Sakif",3 to "Alex");
    println(rollName)
    println(rollName[2])
    println(rollName.size)

    //HashMap
    val food = hashMapOf(1 to " Milk", 2 to " Banana", 3 to " Chocolate")
    food[4]= " Biriyani"
    food.put(5,"Rice")
    println(food)
    food.remove(1)
    println(food.isEmpty())
    println(food)



}