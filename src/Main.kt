
fun main(args: Array<String>){
    val p = Person("","")
    p.name = "Kevin"
    p.email = "kevin@gmail.com"

    println("The name is ${p.name}")

    val x = 2
    when(x){
        1 -> println("X is 1")
        2 -> println("X is 2")
        else -> {
            println("X is neither 1 nor 2")
        }
    }

    for (i in 1..10 step 2){
        println(i)
    }

    val y = if (x == 2) "Hooray" else "Not a 2"
    println(y)
}