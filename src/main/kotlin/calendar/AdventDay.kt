package calendar

import java.lang.StringBuilder

class AdventDay(
    private val day: Int,
    private val solution1: String,
    private val solution2: String
) {
    override fun toString(): String {
        val result = StringBuilder()
        result.append(" ------------ [ Day $day ] ------------ \n")
        result.append("[Puzzle 1: $solution1]\n")
        result.append("[Puzzle 2: $solution2]\n")
        result.append(" ========== End of Day $day ==========\n")
        return result.toString()
    }
}