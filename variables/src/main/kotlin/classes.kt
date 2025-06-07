import kotlin.math.sqrt

fun main(){
    val rect1 = Rectangle(10f,20f)
    println(rect1.width)
    println(rect1.height)

    val rect2 = Rectangle(20f,30f)
    println(rect2.width)
    println(rect2.height)
    println(rect2.diagonal)
    println(rect2.area)

    val rect3 = maxArea(rect1,rect2)
    println(rect3.width)
    println(rect1 == rect2) // true if class is 'data class'

    val react4 = rect1.copy(width = 100f)
    println("${react4.width} ${react4.height}")

    println(sumAreas(rect1 ,rect2))
}

abstract class Shape{
    abstract val area: Float
    abstract val cicumference: Float
}

//interface  Shape {
//    val area: Float
//    val cicumference: Float
//}

fun sumAreas(vararg shapes: Shape): Double{
    return shapes.sumOf { currentShape  ->
        currentShape.area.toDouble()
    }
}

data class Circle (val radius: Float): Shape(){
    override val area = Math.PI.toFloat() * radius * radius    // pi * r * r
    override val cicumference  = 2 * radius * Math.PI.toFloat()
}

fun sumAreas(vararg shapes: List<Int>){}
fun maxArea(rect1: Rectangle, rect2: Rectangle): Rectangle{
    return if (rect1.area > rect2.area){
        rect1
    }else{
        rect2
    }
}
data class Rectangle(
    val width: Float,
    val height: Float):Shape() {
        val diagonal = sqrt(width * width + height * height)
        override  val area = width * height
        override val cicumference: Float
            get()= 2 * width + 2 * height
}
//class Rectangle ( val width: Float, val height: Float){
//    val diagonal = sqrt(width * width + height * height)
//    val area = width * height
//}
