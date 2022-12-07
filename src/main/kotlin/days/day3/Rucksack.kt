package days.day3

class Rucksack(
    private var compartment1: String = "",
    private var compartment2: String = ""
) {
    fun put(items: String) {
        compartment1 = items.substring(0, items.length / 2)
        compartment2 = items.substring(items.length / 2, items.length)
    }

    fun getCommonItemValue(): Int {
        for( actChar in compartment1.toCharArray()) {
            for ( actChar2 in compartment2.toCharArray()){
                if (actChar == actChar2) {
                    return Item(actChar).getValue()
                }
            }
        }
        return 0
    }
}