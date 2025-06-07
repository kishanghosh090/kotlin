fun main(){
    val result = add(2,3)
    println(result)

    println("kishan".reversed())
    "indian institute of technology madras".reversed()
    val input = readln()
    val lattersOnly = input.filter() {
        it.isLetter()
    }

    val favNumbers = intArrayOf(1,2,3,4,5,6)
    val lamda: (Char) -> Boolean = {
        it.isLetter()
    }

//    val even = favNumbers.filter {
//        it % 2 == 0
//    }
    val even = favNumbers.filter { currChar ->
        currChar %2 == 0
    }
    println(even)

    print(lattersOnly)

    val latterOnly2 = input.myFilter {
        it.isLetter()
    }

    val evenNumbers = even.map { it * it }
}

// lamda fun

fun  String.myFilter(predicate: (Char) -> Boolean): String{
    println(this@myFilter)
    return buildString {
        for (char in this@myFilter){
            if(predicate(char)){
                append(char)
            }
        }
    }
}






fun add(num1: Int, num2: Int): Int{
    return num1 + num2
}

// fun extension
fun String.reversed(): String{

    var result = buildString {
        for (i in lastIndex downTo 0){
            append(this[i])
        }
    }
    return result
}

fun Number.reversed(): Int{
    return this.toString().reversed().toInt()
}