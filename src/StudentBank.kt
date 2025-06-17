class StudentAccount(
    private val studentId: String,
    private var accountBalance: Double,
    private val studentName: String,
    private val passwordPin: Int
) {
    fun viewBalance(): Double = accountBalance

    fun saveMoney(amount: Double) {
        if (amount > 0) {
            accountBalance += amount
            println("Saved money. New Balance: $accountBalance")
        } else {
            println("Invalid save amount.")
        }
    }

    fun spendMoney(amount: Double) {
        if (amount > accountBalance) {
            println("Not enough balance to spend.")
        } else if (amount > 0) {
            accountBalance -= amount
            println("Money spent. New Balance: $accountBalance")
        } else {
            println("Invalid spend amount.")
        }
    }
}

fun main() {
    val student = StudentAccount("S123", 100.0, "Charlie", 1111)

    student.saveMoney(150.0)
    student.spendMoney(300.0)
    student.spendMoney(50.0)

    println("Student final balance: ${student.viewBalance()}")
}
