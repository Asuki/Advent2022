package days.day1

class SantaTeam {
    var elves = ArrayList<Elf>()

    private fun getGreatestElves(size: Int): List<Elf> {
        val sortedElves = elves.sortedByDescending { it.getAllCarryingCalorie() }
        return sortedElves.subList(0, size)
    }

    fun getGreatestElvesSum(size: Int): Int {
        val result = Elf(Inventory())
        for (elf in getGreatestElves(size)) {
            result += elf
        }
        return result.getAllCarryingCalorie()
    }
}