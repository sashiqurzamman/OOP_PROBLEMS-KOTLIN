abstract class Appliance {
    abstract fun calculatePowerUsage()
}

class Fan : Appliance() {
    override fun calculatePowerUsage() {
        val hours = 5
        val wattage = 75
        val kWh = (wattage * hours) / 1000.0
        println("Fan used $kWh kWh.")
    }
}

class AirConditioner : Appliance() {
    override fun calculatePowerUsage() {
        val hours = 3
        val wattage = 1500
        val kWh = (wattage * hours) / 1000.0
        println("AirConditioner used $kWh kWh.")
    }
}

class LightBulb : Appliance() {
    override fun calculatePowerUsage() {
        val hours = 10
        val wattage = 10
        val kWh = (wattage * hours) / 1000.0
        println("LightBulb used $kWh kWh.")
    }
}

fun main() {
    val fan = Fan()
    val ac = AirConditioner()
    val bulb = LightBulb()

    fan.calculatePowerUsage()
    ac.calculatePowerUsage()
    bulb.calculatePowerUsage()
}
