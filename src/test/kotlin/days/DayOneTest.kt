package days

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DayOneTest {

    @Test
    fun problemOneTest() {
        val day = DayOneProblemOne()

        val result = day.solve()

        Assertions.assertEquals("7", result)
    }

    @Test
    fun problemTwoTest() {
        val day = DayOneProblemTwo()

        val result = day.solve()

        Assertions.assertEquals("5", result)
    }
}
