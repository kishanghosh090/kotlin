fun main(){
    val myNumbers = intArrayOf(1,2,3,4,5)
    val myChar = charArrayOf('a','b','c')
    val myString = arrayOf("kishan","suresh","jose")
    val myBoolean = booleanArrayOf(true,false,true)
    val myFloat = floatArrayOf(1.2F,2.3F,3.4F)
    val myDouble = doubleArrayOf(1.2,2.3,3.4)
    val myLong = longArrayOf(1,2,3,4,5)

    println(myNumbers[0])
    println(myChar[0])
    println(myString[0])
    println(myBoolean[0])
    println(myFloat[0])
    println(myDouble[0])
    println(myLong[0])

    val myArr = arrayOf(1,"kishan",true)
    println(myArr[0])
    println(myArr[1])
    println(myArr[2])

    var myList = mutableListOf<Int>()
    myList.add(1)
    myList.add(2)
    println(myList[0])


    for (i in myList){
        println(i)
    }
}