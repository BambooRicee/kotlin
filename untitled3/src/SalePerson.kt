class SalePerson: Employee() {
    var numberOfSales = 0 // Объем продаж

    override fun giveBonus(amount: Float){
        val salesBonus = when(numberOfSales){
            in 0..100 -> 10F
            in 101..200 -> 15F
            else -> 20F
        }

        super.giveBonus(amount * salesBonus)
    }

    override fun displayStatus(){
        super.displayStatus()
        println("Объем продаж: $numberOfSales")
    }
}
