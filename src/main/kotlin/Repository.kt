import java.io.File

class Repository {
    fun readElves(fileName: String) {
        var inventory = Inventory()
        File(fileName).forEachLine {
            if (it != "\n" && it.isNotEmpty()) {
                inventory += Food(it.toInt())
            } else {
                santaTeam.elves.add(Elf(inventory))
                inventory = Inventory()
            }
        }
    }
}