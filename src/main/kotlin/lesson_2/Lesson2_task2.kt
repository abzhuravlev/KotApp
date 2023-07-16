package lesson_2
fun main() {
    val amountOfEmployee : Int = 50
    val amountOfScrubs : Int = 30

    val payOfEmployee : Int = 30000
    val payOfScrubs : Int = 20000

    val totalPayOfEmployee = payOfEmployee * amountOfEmployee
    val totalFoundOfPay = totalPayOfEmployee + (payOfScrubs * amountOfScrubs)
    val averagePayOf = totalFoundOfPay / (amountOfEmployee + amountOfScrubs)

    println("Расходы на выплату зарплаты постоянных сотрудников: ${totalPayOfEmployee} рублей")
    println("Общие расходы по ЗП после прихода стажеров: ${totalFoundOfPay} рублей")
    println("Средняя ЗП одного сотрудника после устройства стажеров: ${averagePayOf} рублей")
}