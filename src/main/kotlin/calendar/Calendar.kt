package calendar

import Repository
import day2.Game

class Calendar {
    fun getDays(): List<AdventDay> {
        return listOf(
            dayOne(),
            dayTwo()
        )
    }

    private fun dayOne(): AdventDay {
        val santaTeam = Repository().readElvesWithInventories("E:\\Advent\\1.txt")
        return AdventDay(
            day = 1,
            solution1 = santaTeam.getGreatestElvesSum(1).toString(),
            solution2 = santaTeam.getGreatestElvesSum(3).toString()
        )
    }

    private fun dayTwo(): AdventDay {
        val game = Game()
        for (match in Repository().readGame("E:\\Advent\\2.txt")) {
            game.play(match)
        }
        return AdventDay(
            day = 2,
            solution1 = game.getTotalScore().toString(),
            solution2 = "NONE"
        )
    }
}