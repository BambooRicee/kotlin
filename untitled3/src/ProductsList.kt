data class Products(
    val registrationNumber: Int,
    val name: String,
    val quantity: Int,
    val price: Int,
    val date: String
)
class ProductsList : IClassInfo<Products>, IClassChange<Products> {
    private val products = mutableListOf<Products>()

    override fun input(items: List<Products>) {
        products.addAll(items)
    }

    override fun display() {
        if (products.isEmpty()) {
            println("Информация о товарах пуста")
            return
        }
        for (product in products) {
            println("${product.name}: ${product.quantity} -количество товаров, ${product.price} -цена товара, " +
                    "${product.date} -дата поступления")
        }
    }
    override fun delete(item: Products) {
        products.remove(item)
    }

    override fun sort(comparator: Comparator<Products>) {
        products.sortWith(comparator)
    }

    override fun filter(predicate: (Products) -> Boolean) {
        val filteredEmployees = products.filter(predicate)
        if (filteredEmployees.isEmpty()) {
            println("Таких элементов нет")
        } else {
            for (product in filteredEmployees) {
                println("${product.name}: ${product.quantity} :количество товаров, ${product.price} :цена товара, " +
                        "${product.date} :дата поступления")
            }
        }
    }

}
interface IClassInfo<T> {
    fun input(items: List<T>)
    fun display()
    fun delete(item: T)
}

interface IClassChange<T> {
    fun sort(comparator: Comparator<T>)
    fun filter(predicate: (T) -> Boolean)
}
