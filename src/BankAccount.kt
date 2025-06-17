class BankAccount(
    private val accountNumber: String,
    private var balance: Double,
    private val name: String,
    private val pin: Int
) {
    fun getBalance(): Double = balance

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposit successful. New Balance: $balance")
        } else {
            println("Invalid deposit amount.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > balance) {
            println("Insufficient funds. Withdrawal failed.")
        } else if (amount > 0) {
            balance -= amount
            println("Withdrawal successful. New Balance: $balance")
        } else {
            println("Invalid withdrawal amount.")
        }
    }
}

fun main() {
    val account = BankAccount("1234567890", 1000.0, "John Doe", 1234)

    account.deposit(500.0)
    account.withdraw(2000.0) // exceeds balance
    account.withdraw(400.0)

    println("Final Balance: ${account.getBalance()}")
}
