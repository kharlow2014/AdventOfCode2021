import days.DayOneProblemOne
import days.DayOneProblemTwo

val problems: List<DayOfCode> = listOf(DayOneProblemOne(), DayOneProblemTwo())

fun main(args: Array<String>) {
    val results = problems.map { Runner.run(it) }
    println("${results.last().answer}\nruntime: ${results.last().runtime}")
}