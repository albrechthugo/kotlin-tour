import kotlin.math.PI

fun circleArea(radius: Int): Double {
    val area = PI * radius * radius

    return area
}

fun main() {
    println(circleArea(2))
}