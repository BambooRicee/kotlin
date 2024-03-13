fun main() {
    val store = ProductsList()
    val products = listOf(
        Products(1, "Цифровой фотоаппарат",  2, 113000 , "28.02.2024"),
        Products(2, "Смартфон", 1 , 34000, "20.02.2024"),
        Products(3, "Наушники", 5,  3200, "23.02.2024"),
        Products(4, "Зарядное устройство", 20, 700, "29.02.2024"),
        Products(5, "Портативная акустика", 1, 120000, "29.02.2024")
    )
    store.input(products)

    println("Все товары:")
    store.display()

    println("\nТовары с стоимостью больше 100000 :")
    store.filter { it.price > 100000 }
}
