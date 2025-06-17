1. Problem Title: Implement a Secure Bank Account System using Encapsulation and
Abstraction in Kotlin

Full Problem Statement (as if you're giving it to students or learners):
Objective:
Create a Kotlin class to simulate a simple bank account that securely manages account
operations using Object-Oriented Programming (OOP) principles — specifically encapsulation
and abstraction.
Requirements:
1. Define a BankAccount class with the following private properties:
o accountNumber: String
o balance: Double
o name: String
o pin: Int
2. Use encapsulation to control access to sensitive properties like balance.
3. Provide the following public methods (with abstraction of internal logic):
o getBalance(): Returns the current balance.
o deposit(amount: Double): Increases the balance if the amount is valid.
o withdraw(amount: Double): Decreases the balance if sufficient funds are
available.
4. In the main() function:
o Create a BankAccount object.
o Perform a deposit.
o Attempt a withdrawal that exceeds the balance.
o Perform a valid withdrawal.
o Print the balance after each operation.

Concepts Covered:
• Encapsulation
• Abstraction
• Class design
• Method validation
• Private member access control
2. Problem Title: SmartWallet: Design a Digital Wallet System using OOP in Kotlin
Problem Statement:
Objective:
Create a Kotlin class that simulates a digital wallet using Object-Oriented Programming
principles — mainly encapsulation and abstraction.
Requirements:
• Define a SmartWallet class with private properties:
o walletId: String
o balance: Double
o ownerName: String
o securityPin: Int
• Use encapsulation to protect and control access to wallet data.
• Implement public methods:
o getBalance(): Returns the current wallet balance.
o addFunds(amount: Double): Adds money if the amount is valid.
o makePayment(amount: Double): Deducts money if sufficient funds exist.
• In main():
o Create a SmartWallet object.
o Perform addFunds and makePayment operations.
o Print balance after each operation.

3. Problem Title: ATM Simulator: Build a Bank ATM System using Kotlin OOP
Problem Statement:
Objective:
Design a basic ATM system where users can interact with their account securely using Kotlin
OOP — focusing on abstraction and encapsulation.
Requirements:
• Define a ATMAccount class with:
o cardNumber: String
o currentBalance: Double
o accountHolder: String
o atmPin: Int (all private)
• Allow secure access to the balance and transactions:
o checkBalance()
o depositCash(amount: Double)
o withdrawCash(amount: Double)
• In main():
o Simulate an account session by calling methods and displaying balances.

4. Problem Title: Student Bank App: Manage Student Savings Account using Kotlin Classes
Problem Statement:
Objective:
Create a Kotlin-based simulation of a student savings account system that demonstrates core
OOP concepts, including data hiding and interface abstraction.
Requirements:
• Build a class StudentAccount with the following private fields:
o studentId: String

o accountBalance: Double
o studentName: String
o passwordPin: Int
• Methods to:
o viewBalance()
o saveMoney(amount: Double)
o spendMoney(amount: Double)
• In the main() function:
o Simulate a student saving and spending money, and print the balance updates.

Inheritance and Polymorphism

1. Appliance Power Usage Calculator
Problem Title: Appliance Power Calculator using OOP in
Kotlin
Problem Statement:
Objective:
Design a Kotlin program that calculates power usage for different
household appliances using abstraction and inheritance.
Requirements:
1. Create an abstract class Appliance with an open method
calculatePowerUsage().
2. Create three subclasses:
o Fan: Assume it runs for 5 hours at 75 watts.

o AirConditioner: Assume it runs for 3 hours at 1500 watts.
o LightBulb: Assume it runs for 10 hours at 10 watts.
3. Each subclass should override calculatePowerUsage() and print
how many kilowatt-hours (kWh) it consumed using:
kWh=wattage×hours1000\text{kWh} = \frac{\text{wattage} \times
\text{hours}}{1000}kWh=1000wattage×hours
4. In the main() function:
o Create objects of each subclass.
o Call the calculatePowerUsage() method for each object.
Concepts Covered:
• Abstraction
• Method Overriding
• Inheritance
• Real-world modeling

2. Vehicle Speed Reporter
Problem Title: Vehicle Speed Display using Inheritance in
Kotlin
Problem Statement:
Objective:

Simulate different types of vehicles and their speed using object-
oriented principles in Kotlin.

Requirements:
1. Define an abstract class Vehicle with an open method
showSpeed().
2. Create the following subclasses:
o Car: Outputs a message with a speed of 120 km/h.
o Bike: Outputs a message with a speed of 80 km/h.
o Bus: Outputs a message with a speed of 60 km/h.
3. Override the showSpeed() method in each subclass to print its
respective speed.
4. In the main() function:
o Create objects for each vehicle type.
o Call showSpeed() on each object.
Concepts Covered:
• Inheritance
• Polymorphism
• Overriding Methods
• Encapsulation of behavior

3. E-Commerce Discount System
Problem Title: Implement a Discount System for Products
using Kotlin OOP
Problem Statement:

Objective:
Develop a product-based discount system where different product
categories have unique discount rules using abstraction and
inheritance in Kotlin.
Requirements:
1. Create an abstract class Product with an open method
applyDiscount().
2. Create three subclasses:
o Electronics: Apply a 10% discount on a price of Tk 20,000.
o Clothing: Apply a 20% discount on a price of Tk 5,000.
o Groceries: Apply a 5% discount on a price of Tk 1,000.
3. Override the applyDiscount() method in each subclass to calculate
and print the discount amount.
4. In the main() function:
o Create instances of each product type.
o Call the applyDiscount() method on each.
Concepts Covered:
• Abstract Classes
• Method Overriding
• Category-based Business Logic
• Encapsulation
