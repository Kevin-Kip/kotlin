
fun main(args: Array<String>){
    //creating an instance of a class
    val p = Person("","")
    p.name = "Kevin" //setter
    p.email = "kevin@gmail.com" // setter

    println("The name is ${p.name}") // getter

    val x = 2 // variable declaration. This can be val x: Int = 2

    // This is the equivqlent if a switch statement
    when(x){
        1 -> println("X is 1")
        2 -> println("X is 2")
        else -> {
            println("X is neither 1 nor 2")
        }
    }

    // for loop
    /*
    * This is like:
    *
    * // Java
    * for (int i = 1; i <= 10; i+2){
    *   System.out.println(i)
    * }
    *
    *
    * */
    for (i in 1..10 step 2){
        println(i)
    }

    // simplified if statement
    /*
    * This is like:
    *
    * //kotlin
    * if(x == 2){
    *   println("Hooray")
    * } else {
    *   println("Not a 2")
    * }
    * */
    val y = if (x == 2) "Hooray" else "Not a 2"
    println(y)

    //list
    val myList = listOf(1,2,3,4,5,"3")
    for (item in myList) println("Value of item is ${item}")
}