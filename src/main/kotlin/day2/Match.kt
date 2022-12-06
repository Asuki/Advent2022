package day2

data class Match(
    val accessory1: Accessory,
    val accessory2: Accessory
) {
    fun win(): Boolean = accessory2.wins == accessory1.name
    fun draw(): Boolean =
        accessory2.name ==
                accessory1.name

    fun getAccessoryValue(): Int = accessory2.value
}