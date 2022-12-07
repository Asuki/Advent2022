import days.day1.Elf
import days.day1.Inventory
import days.day1.SantaTeam
import days.day2.Accessories
import days.day2.Match
import java.io.File

class Repository {
    fun readElvesWithInventories(fileName: String): SantaTeam {
        val santaTeam = SantaTeam()
        var inventory = Inventory()
        File(fileName).forEachLine {
            if (it != "\n" && it.isNotEmpty()) {
                inventory += days.day1.Food(it.toInt())
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
            result.add(
                Match(
                Accessories.getAccessoryByCode(items[0]),
                Accessories.getAccessoryByCode(items[1]))
            )
        }
        return result
    }

    fun readGame2(fileName: String): List<Match> {
        val result = ArrayList<Match>()
        File(fileName).forEachLine {
            val items = it.split(" ")
            val actAccessory = Accessories.getAccessoryByCode(items[0])
            result.add(
                Match(
                    actAccessory,
                    Accessories.getAccessoryByCommand(
                        accessory = actAccessory,
                        command = items[1]
                    )
                )
            )
        }
        return result
    }

    fun readRucksackItems(fileName: String): List<String> {
        val result = ArrayList<String>()
        File(fileName).forEachLine {
            result.add(it)
        }
        return result
    }
}