fun main() {
    val santaTeam = Repository().readElves("E:\\Advent\\elves.txt")
    println(santaTeam.getGreatestElvesSum(3))
}

