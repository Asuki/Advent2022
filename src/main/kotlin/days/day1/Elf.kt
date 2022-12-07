package days.day1

class Elf(
    private val inventory: Inventory
) : Comparator<Inventory> {
    fun getAllCarryingCalorie(): Int {
        return inventory.getCalories()
    }

    private fun getFoods() : ArrayList<Food> = inventory.getFoods()

    override fun compare(o1: Inventory, o2: Inventory): Int  {
        return o1.getCalories() - o2.getCalories()
    }

    operator fun compareTo(elf2: Elf): Int {
        return getAllCarryingCalorie().compareTo(elf2.getAllCarryingCalorie())
    }

    override fun toString(): String {
        return "[day1.Inventory size: ${getAllCarryingCalorie()}]"
    }

    operator fun plusAssign(elf: Elf) {
        for (food in elf.getFoods()){
            inventory += food
        }
    }
}