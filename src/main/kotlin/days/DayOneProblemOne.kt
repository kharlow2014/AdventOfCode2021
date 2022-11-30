package days

import DayOfCode

class DayOneProblemOne : DayOfCode(Day.ONE, Problem.ONE) {
    override val dataFileName
        get() = "/one.data"

    override fun solve(): String {
        var increases = 0
        this::class.java.getResourceAsStream(dataFileName).bufferedReader().readLines().map { it.toInt() }.zipWithNext()
            .forEach {
                if (it.second > it.first) {
                    increases++
                }
            }
        return "$increases"
    }
}