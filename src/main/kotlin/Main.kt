import kotlin.random.Random

data class Employee(val name: String, var salary: Int)

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    private val availableEmployees = listOf("Max", "Oscar", "Lando")

    fun generateEmployee(): Employee {
        val salary = Random.nextInt(minSalary, maxSalary)
        val name = availableEmployees.random()

        return Employee(name, salary)
    }
}


fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}