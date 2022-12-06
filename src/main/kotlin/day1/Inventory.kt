package day1

class Inventory {
    private val foods = ArrayList<Food>()

    fun getFoods() : ArrayList<Food> = foods

    fun getCalories(): Int {
        var result = 0
        for (food in foods){
            result += food.calorie
        }
        return result
    }

    operator fun plusAssign(food: Food) {
        foods.add(food)
    }
}