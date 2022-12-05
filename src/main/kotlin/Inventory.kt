class Inventory {
    private val foods = ArrayList<Food>()

    fun addFood(food: Food){
        foods.add(food)
    }

    fun getFoods() : ArrayList<Food> = foods

    fun getCalories(): Int {
        var result = 0
        for (food in foods){
            result += food.calorie
        }
        return result
    }
}