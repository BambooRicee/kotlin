fun main() {
        val manager = Manager()
        manager.empId = 1
        manager.fullName = "Иванов Иван Иванович"
        manager.currPay = 25000F
        manager.numberOfOptions = 500
        manager.giveBonus(5000F)
        manager.displayStatus()
        val salePerson = SalePerson()
        salePerson.empId = 2
        salePerson.fullName = "Петров Петр Петрович"
        salePerson.currPay = 15000F
        salePerson.numberOfSales = 40
        salePerson.giveBonus(3000F)
        salePerson.displayStatus()
    }
