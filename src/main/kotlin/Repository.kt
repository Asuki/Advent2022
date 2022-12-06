import day1.Elf
import day1.Inventory
import day1.SantaTeam
import day2.Accessories
import day2.Match
import java.io.File

class Repository {
    fun readElvesWithInventories(fileName: String): SantaTeam {
        val santaTeam = SantaTeam()
        var inventory = Inventory()
        File(fileName).forEachLine {
            if (it != "\n" && it.isNotEmpty()) {
                inventory += day1.Food(it.toInt())
            } else {
                santaTeam.elves.add(Elf(inventory))
                inventory = Inventory()
            }
        }
        return santaTeam
    }

    fun readGame(fileName: String): List<Match> {
        val result = ArrayList<Match>()
        File(fileName).forEachLine {
            val items = it.split(" ")
            result.add(Match(
                Accessories.getAccessory(items[0]),
                Accessories.getAccessory(items[1]))
            )
        }
        return result
    }
}