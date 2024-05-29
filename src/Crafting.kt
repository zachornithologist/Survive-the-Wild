

class Crafting {
    fun craftItem(resources: List<Resource>, recipe: Recipe): Item? {
        // Implement crafting logic here
        return null
    }
}

data class Recipe(val ingredients: List<Resource>, val result: Item)
data class Item(val name: String)
