package day1

class Elf(
    private val inventory: Inventory
) : Comparator<Inventory> {
    fun getAllCaloriesInInventory(): Int {
        return inventory.getCalories()
    }

    private fun getFoods() : ArrayList<Food> = inventory.getFoods()

    override fun compare(o1: Inventory, o2: Inventory): Int  {
        return o1.getCalories() - o2.getCalories()
    }

    operator fun compareTo(elf2: Elf): Int {
        return getAllCaloriesInInventory().compareTo(elf2.getAllCaloriesInInventory())
    }

    override fun toString(): String {
        return "[day1.Inventory size: ${getAllCaloriesInInventory()}]"
    }

    operator fun plusAssign(elf: Elf) {
        for (food in elf.getFoods()){
            inventory += food
        }
    }
}