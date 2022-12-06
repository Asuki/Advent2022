package day2

import Constants

class Accessories {
    companion object {
        fun getAccessoryByCode(accessory: String): Accessory {
            return when (accessory) {
                "A" -> ROCK
                "B" -> PAPER
                else -> SCISSORS
            }
        }

        private fun getAccessoryByName(name: String): Accessory = when (name) {
            Constants.ROCK -> ROCK
            Constants.PAPER -> PAPER
            else -> SCISSORS
        }

        fun getAccessoryByCommand (accessory: Accessory, command: String): Accessory = when (command) {
            "X" -> getAccessoryByName(accessory.wins)
            "Z" -> getAccessoryByName(accessory.loss)
            else -> getAccessoryByName(accessory.name)
        }

        private val ROCK: Accessory =
            Accessory(name = Constants.ROCK, value = 1, wins = Constants.SCISSORS, loss = Constants.PAPER)
        private val PAPER: Accessory =
            Accessory(name = Constants.PAPER, value = 2, wins = Constants.ROCK, loss = Constants.SCISSORS)
        private val SCISSORS: Accessory =
            Accessory(name = Constants.SCISSORS, value = 3, wins = Constants.PAPER, loss = Constants.ROCK)
    }
}