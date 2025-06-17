class ATMAccount(
    private val cardNumber: String,
    private var currentBalance: Double,
    private val accountHolder: String,
    private val atmPin: Int
) {
    fun checkBalance(): Double = currentBalance

    fun depositCash(amount: Double) {
        if (amount > 0) {
            currentBalance += amount
            println("Cash deposited. New Balance: $currentBalance")
        } else {
            println("Invalid deposit amount.")
        }
    }

    fun withdrawCash(amount: Double) {
        if (amount > currentBalance) {
            println("Withdrawal failed. Not enough funds.")
        } else if (amount > 0) {
            currentBalance -= amount
            println("Cash withdrawn. New Balance: $currentBalance")
        } else {
            println("Invalid withdrawal amount.")
        }
    }
}

fun main() {
    val atm = ATMAccount("9876543210", 1500.0, "Bob", 4321)

    atm.depositCash(500.0)
    atm.withdrawCash(2200.0)
    atm.withdrawCash(300.0)

    println("Balance at session end: ${atm.checkBalance()}")
}
