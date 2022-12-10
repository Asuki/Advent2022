package days.day3

class ElfGroup(private var rucksacks: List<Rucksack>) {
    fun getBadgeValue(): Int {
        if ( rucksacks.size <= 1 ) {
            return 0
        }
        var commonValue = rucksacks[0].getAllItems()
        for (i in 1 until rucksacks.size) {
            var currentCommonItem = ""
            for (c in commonValue.toCharArray()){
                for (r in rucksacks[i].getAllItems().toCharArray()){
                    if(c == r){
                        if (!currentCommonItem.contains(c)) {
                            currentCommonItem += c
                        }
                    }
                }
            }
            commonValue = currentCommonItem
        }
        return if (commonValue.length != 1) {
            0
        } else {
            Item(commonValue.toCharArray()[0])
                .getValue()
        }
    }

    fun getCommonItemsValue(): Int{
        var result = 0
        for(rucksack in rucksacks){
            result += rucksack.getCommonItemValue()
        }
        return result
    }
}