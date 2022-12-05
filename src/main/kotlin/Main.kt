import java.io.File

val santaTeam = SantaTeam()

fun main() {
    readElves("E:\\Advent\\elves.txt")
    println(santaTeam.getGreatestElvesSum(3))
}

fun readElves(fileName: String) {
    var inventory = Inventory()
    File(fileName).forEachLine {
        if (it != "\n" && it.isNotEmpty()) {
            inventory.addFood(Food(it.toInt()))
        } else {
            santaTeam.elves.add(Elf(inventory))
            inventory = Inventory()
        }
    }
}