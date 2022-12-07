package calendar

import Repository
import days.day2.Game
import days.day3.Rucksack

class Calendar {
    fun getDays(): List<AdventDay> {
        return listOf(
            dayOne(Constants.getFullPath(fileName = "day1")),
            dayTwo(Constants.getFullPath(fileName = "day2")),
            dayThree(Constants.getFullPath(fileName = "day3"))
        )
    }

    private fun dayOne(path: String): AdventDay {
        val santaTeam = Repository().readElvesWithInventories(path)
        return AdventDay(
            day = 1,
            solution1 = santaTeam.getGreatestElvesSum(1).toString(),
            solution2 = santaTeam.getGreatestElvesSum(3).toString()
        )
    }

    private fun dayTwo(path: String): AdventDay {
        val game = Game()
        for (match in Repository().readGame(path)) {
            game.play(match)
        }
        val solution1 = game.getTotalScore().toString()
        game.reset()
        for (match in Repository().readGame2(path)) {
            game.play(match)
        }
        return AdventDay(
            day = 2,
            solution1 = solution1,
            solution2 = game.getTotalScore().toString()
        )
    }

    private fun dayThree(path: String): AdventDay {
        val items: List<String> = Repository().readRucksackItems(path)
        var solution1 = 0
        for ( actItem in items){
            val rucksack = Rucksack()
            rucksack.put(actItem)
            solution1 += rucksack.getCommonItemValue()
        }
        return AdventDay(
            day = 3,
            solution1 = solution1.toString()
        )
    }
}