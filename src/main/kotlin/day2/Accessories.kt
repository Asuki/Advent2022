package day2

class Accessories {
    companion object {
        fun getAccessory(accessory: String): Accessory{
            return when (accessory) {
                "A", "X" -> {
                    ROCK
                }
                "B", "Y" -> {
                    PAPER
                }
                else -> {
                    SCISSORS
                }
            }
        }

        private val ROCK: Accessory =
            Accessory(name = Constants.ROCK, value = 1, wins = Constants.SCISSORS, loss = Constants.PAPER)
        private val PAPER: Accessory =
            Accessory(name = Constants.PAPER, value = 2, wins = Constants.ROCK, loss = Constants.SCISSORS)
        private val SCISSORS: Accessory =
            Accessory(name = Constants.SCISSORS, value = 3, wins = Constants.PAPER, loss = Constants.ROCK)
    }
}