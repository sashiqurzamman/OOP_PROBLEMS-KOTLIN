abstract class Vehicle {
    abstract fun showSpeed()
}

class Car : Vehicle() {
    override fun showSpeed() {
        println("Car speed is 120 km/h.")
    }
}

class Bike : Vehicle() {
    override fun showSpeed() {
        println("Bike speed is 80 km/h.")
    }
}

class Bus : Vehicle() {
    override fun showSpeed() {
        println("Bus speed is 60 km/h.")
    }
}

fun main() {
    val car = Car()
    val bike = Bike()
    val bus = Bus()

    car.showSpeed()
    bike.showSpeed()
    bus.showSpeed()
}
