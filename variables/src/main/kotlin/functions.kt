fun main(){
    val result = add(2,3)
    println(result)

    println(reversedString("kishan"))
}

fun add(num1: Int, num2: Int): Int{
    return num1 + num2
}

fun reversedString(str: String): String{

    var result = buildString {
        for (i in str.length-1 downTo 0){
            append(str[i])
        }
    }
    return result
}