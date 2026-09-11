package com.fruitapp.data

object FruitRepository {

    // A large catalog covering common + exotic fruits from around the world.
    // Add more entries here anytime — search works automatically on whatever is in this list.
    val allFruits: List<Fruit> = listOf(
        Fruit(1, "Apple", "🍎", 120.0, "kg", "Seasonal", badge = "New"),
        Fruit(2, "Green Apple", "🍏", 140.0, "kg", "Seasonal"),
        Fruit(3, "Banana", "🍌", 50.0, "dozen", "Seasonal"),
        Fruit(4, "Grapes", "🍇", 90.0, "kg", "Berries", badge = "Hot"),
        Fruit(5, "Orange", "🍊", 80.0, "kg", "Seasonal"),
        Fruit(6, "Mango", "🥭", 150.0, "kg", "Tropical", badge = "Exotic", isExotic = true),
        Fruit(7, "Pineapple", "🍍", 60.0, "pc", "Tropical"),
        Fruit(8, "Kiwi", "🥝", 200.0, "kg", "Exotic", badge = "Exotic", isExotic = true),
        Fruit(9, "Peach", "🍑", 180.0, "kg", "Seasonal"),
        Fruit(10, "Cherry", "🍒", 450.0, "kg", "Exotic", badge = "Exotic", isExotic = true),
        Fruit(11, "Lemon", "🍋", 40.0, "kg", "Seasonal"),
        Fruit(12, "Melon", "🍈", 45.0, "kg", "Melons"),
        Fruit(13, "Watermelon", "🍉", 35.0, "kg", "Melons"),
        Fruit(14, "Coconut", "🥥", 40.0, "pc", "Tropical"),
        Fruit(15, "Blueberry", "🫐", 350.0, "box", "Berries", badge = "Exotic", isExotic = true),
        Fruit(16, "Pear", "🍐", 130.0, "kg", "Seasonal"),
        Fruit(17, "Avocado", "🥑", 220.0, "kg", "Exotic", badge = "Exotic", isExotic = true),
        Fruit(18, "Dragon Fruit", "🐉", 250.0, "kg", "Exotic", badge = "Exotic", isExotic = true),
        Fruit(19, "Litchi", "🍇", 180.0, "kg", "Seasonal", badge = "Seasonal"),
        Fruit(20, "Pomegranate", "🍎", 160.0, "kg", "Seasonal"),
        Fruit(21, "Papaya", "🥭", 55.0, "kg", "Tropical"),
        Fruit(22, "Guava", "🍈", 65.0, "kg", "Seasonal"),
        Fruit(23, "Strawberry", "🍓", 300.0, "box", "Berries"),
        Fruit(24, "Raspberry", "🍓", 380.0, "box", "Berries", badge = "Exotic", isExotic = true),
        Fruit(25, "Blackberry", "🫐", 340.0, "box", "Berries", badge = "Exotic", isExotic = true),
        Fruit(26, "Plum", "🍑", 170.0, "kg", "Seasonal"),
        Fruit(27, "Apricot", "🍑", 190.0, "kg", "Seasonal"),
        Fruit(28, "Fig", "🍈", 260.0, "kg", "Exotic", badge = "Exotic", isExotic = true),
        Fruit(29, "Custard Apple", "🍈", 140.0, "kg", "Seasonal"),
        Fruit(30, "Jackfruit", "🍈", 70.0, "kg", "Tropical"),
        Fruit(31, "Passion Fruit", "🥭", 400.0, "box", "Exotic", badge = "Exotic", isExotic = true),
        Fruit(32, "Star Fruit", "⭐", 220.0, "kg", "Exotic", badge = "Exotic", isExotic = true),
        Fruit(33, "Lychee", "🍇", 200.0, "kg", "Seasonal"),
        Fruit(34, "Mulberry", "🫐", 320.0, "box", "Berries"),
        Fruit(35, "Cranberry", "🍒", 500.0, "box", "Berries", badge = "Exotic", isExotic = true),
        Fruit(36, "Persimmon", "🍅", 180.0, "kg", "Exotic", isExotic = true),
        Fruit(37, "Tamarind", "🍈", 90.0, "kg", "Seasonal"),
        Fruit(38, "Sapota (Chikoo)", "🍈", 70.0, "kg", "Seasonal"),
        Fruit(39, "Muskmelon", "🍈", 50.0, "kg", "Melons"),
        Fruit(40, "Rambutan", "🍒", 450.0, "kg", "Exotic", badge = "Exotic", isExotic = true),
        Fruit(41, "Mangosteen", "🟣", 480.0, "kg", "Exotic", badge = "Exotic", isExotic = true),
        Fruit(42, "Kinnow", "🍊", 60.0, "kg", "Seasonal"),
        Fruit(43, "Sweet Lime (Mosambi)", "🍋", 45.0, "kg", "Seasonal"),
        Fruit(44, "Grapefruit", "🍊", 130.0, "kg", "Exotic", isExotic = true),
        Fruit(45, "Dates", "🌰", 350.0, "box", "Dry Fruits"),
        Fruit(46, "Raisins", "🌰", 280.0, "box", "Dry Fruits"),
        Fruit(47, "Dry Apricot", "🌰", 500.0, "box", "Dry Fruits"),
        Fruit(48, "Almonds", "🌰", 800.0, "kg", "Dry Fruits"),
        Fruit(49, "Cashew", "🌰", 900.0, "kg", "Dry Fruits"),
        Fruit(50, "Walnut", "🌰", 850.0, "kg", "Dry Fruits")
    )

    fun search(query: String): List<Fruit> {
        if (query.isBlank()) return allFruits
        val q = query.trim().lowercase()
        return allFruits.filter { fruit ->
            fruit.name.lowercase().contains(q) || fruit.category.lowercase().contains(q)
        }
    }

    fun byCategory(category: String): List<Fruit> {
        if (category.equals("All", ignoreCase = true)) return allFruits
        return allFruits.filter { it.category.equals(category, ignoreCase = true) }
    }

    val categories = listOf("All", "Seasonal", "Exotic", "Berries", "Melons", "Tropical", "Dry Fruits")
}
