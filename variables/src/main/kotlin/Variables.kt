import kotlin.reflect.typeOf

fun main(){
    var userName: String = "kishan"
//    val age = 23
    print("hello world $userName");
    userName = "chai aur code"
//    print(userName[2])

    var age = 12 //constant for val
    age++;
    age += 12

    val myNumber: Float = 2.5F

    val mySecindNumber: Double = 2.23343443

    val myCharVal: Char = 'a'
//    print(myCharVal)

    val myboolean: Boolean = true
    val score = 85
    var marks = if (score>=85){
        "you can code"
    }else{
        "you caan't code"
    }

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        else -> "C"
    }
    //for (i in 1..5) println(i)

    val list = mutableListOf(1, 2, 3)
    list.add(4)
    list.removeLast()
    print(list)

    println("please enter a number")
    // val input = readln().toIntOrNull() ?: 0
    val input = readln().toIntOrNull()?.inc()
    // val isEven = input!! % 2 == 0
   if (input != null){
       val  isEven = input % 2 == 0
   }

    try {
        val input = readln().toIntOrNull()

    }catch (e: Exception){
        print(e)
    }

    println(input)
}

