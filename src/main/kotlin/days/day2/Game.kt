package days.day2

class Game {
    private var playScore: Int = 0
    private var accessoryScore: Int = 0

    fun getTotalScore(): Int = playScore + accessoryScore
    fun play(match: Match) {
        var score = 0
        if (match.win()) {
            score = 6
        } else if (match.draw()) {
            score = 3
        }
        accessoryScore += match.getAccessoryValue()
        playScore += score
    }

    fun reset(){
        playScore = 0
        accessoryScore = 0
    }
}
