fun main() {
    val santaTeam = Repository().readElvesWithInventories("E:\\Advent\\elves.txt")
    println(santaTeam.getGreatestElvesSum(3))
}

