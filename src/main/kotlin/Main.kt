fun main() {
    for (number in 1..100) {
        val isDivisibleByThree = number % 3 == 0
        val isDivisibleByFive = number % 5 == 0

        println(
            when {
                isDivisibleByFive && isDivisibleByThree -> "fizzbuzz"
                isDivisibleByFive -> "buzz"
                isDivisibleByThree -> "fizz"
                else -> number
            }
        )
    }
}