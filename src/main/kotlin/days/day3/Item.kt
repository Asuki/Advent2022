package days.day3

class Item (
    private val name: Char = 'a'
){
    fun getValue(): Int {
        return if (name.code < 'a'.code){
            name.code - 'A'.code + 27
        } else {
            name.code - 'a'.code + 1
        }
    }
}