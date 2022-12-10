import days.day1.Elf
import days.day1.Inventory
import days.day1.SantaTeam
import days.day2.Accessories
import days.day2.Match
import days.day3.ElfGroup
import days.day3.Rucksack
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

    fun readRucksackItems(fileName: String): ArrayList<ElfGroup> {
        val result = ArrayList<ElfGroup>()
        var rucksacks = ArrayList<Rucksack>()
        File(fileName).forEachLine {
            val rucksack = Rucksack()
            rucksack.put(it)
            rucksacks.add(rucksack)
            if (rucksacks.size == 3){
                val elfGroup = ElfGroup(rucksacks)
                rucksacks = ArrayList()
                result.add(elfGroup)
            }
        }
        return result
    }
}