class SmartWallet(
    private val walletId: String,
    private var balance: Double,
    private val ownerName: String,
    private val securityPin: Int
) {
    fun getBalance(): Double = balance

    fun addFunds(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Funds added. New Balance: $balance")
        } else {
            println("Invalid amount.")
        }
    }

    fun makePayment(amount: Double) {
        if (amount > balance) {
            println("Payment failed. Not enough balance.")
        } else if (amount > 0) {
            balance -= amount
            println("Payment successful. New Balance: $balance")
        } else {
            println("Invalid payment amount.")
        }
    }
}

fun main() {
    val wallet = SmartWallet("W001", 300.0, "Alice", 9999)

    wallet.addFunds(200.0)
    wallet.makePayment(600.0) // exceed
    wallet.makePayment(250.0)

    println("Final Wallet Balance: ${wallet.getBalance()}")
}
