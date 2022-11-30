package days

import DayOfCode

class DayOneProblemTwo : DayOfCode(Day.ONE, Problem.TWO) {

    override val dataFileName: String
        get() = "/one.data"

    override fun solve(): String {
        var increases = 0
        var previousDepth = Int.MAX_VALUE
        this::class.java.getResourceAsStream(dataFileName).bufferedReader().readLines().map { it.toInt() }.windowed(3).forEach {
            val currentDepth = it.sum()
            if (currentDepth > previousDepth) {
                increases++
            }
            previousDepth = currentDepth
        }
        return "$increases"
    }
}