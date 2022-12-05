val santaTeam = SantaTeam()

fun main() {
    Repository().readElves("E:\\Advent\\elves.txt")
    println(santaTeam.getGreatestElvesSum(3))
}

