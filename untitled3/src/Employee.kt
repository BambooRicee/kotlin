// Класс "Сотрудник"
open class Employee {
    var empId = 0
    var fullName = ""
    var currPay = 0f
    open fun giveBonus(amount: Float){
        currPay += amount
    }
    open fun displayStatus(){
        println("Код: $empId")
        println("ФИО: $fullName")
        println("Зарплата: $currPay")
    }

}
