import kotlin.random.Random

fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    val isDicesEqual = firstResult == secondResult

    if (isDicesEqual) {
        println("You win :)")
    } else {
        println("You lose :(")
    }
}