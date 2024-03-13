class Manager: Employee() {
    var numberOfOptions: Int = 0

    override fun giveBonus(amount: Float){

        super.giveBonus(amount)

        numberOfOptions += amount.toInt() * 10
    }
    override fun displayStatus(){
        super.displayStatus()
        println("Количество опционов: $numberOfOptions")
    }
}