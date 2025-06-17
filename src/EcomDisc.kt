abstract class Product {
    abstract fun applyDiscount()
}

class Electronics : Product() {
    private val price = 20000.0
    override fun applyDiscount() {
        val discount = price * 0.10
        println("Electronics discount: Tk $discount")
    }
}

class Clothing : Product() {
    private val price = 5000.0
    override fun applyDiscount() {
        val discount = price * 0.20
        println("Clothing discount: Tk $discount")
    }
}

class Groceries : Product() {
    private val price = 1000.0
    override fun applyDiscount() {
        val discount = price * 0.05
        println("Groceries discount: Tk $discount")
    }
}

fun main() {
    val electronics = Electronics()
    val clothing = Clothing()
    val groceries = Groceries()

    electronics.applyDiscount()
    clothing.applyDiscount()
    groceries.applyDiscount()
}
