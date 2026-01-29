# 🏦 Java OOPS Banking System

This is a simple **Banking System in Java** created to demonstrate the core concepts of **Object-Oriented Programming (OOPS)**:

- Encapsulation  
- Inheritance  
- Polymorphism  

This project was built as an academic assignment.

---

## 📌 Features

- Abstract base class `BankAccount`
- Two account types:
  - `SavingsAccount` (with interest feature)
  - `CheckingAccount` (with overdraft feature)
- Proper data hiding using private variables
- Method overriding and runtime polymorphism
- A `BankManager` class to test the system

---

## 🧱 Class Structure

### 🔹 BankAccount (abstract)
- Fields: `accountNumber`, `accountHolderName`, `balance`
- Methods: `deposit()`, `withdraw()`, `getBalance()`, `getAccountDetails()`

### 🔹 SavingsAccount extends BankAccount
- Field: `interestRate`
- Method: `applyInterest()`

### 🔹 CheckingAccount extends BankAccount
- Field: `overdraftLimit`
- Overrides `withdraw()` to allow overdraft

### 🔹 BankManager
- Contains `main()` method
- Demonstrates polymorphism using a list of `BankAccount`

---

## 🔁 How Polymorphism is Demonstrated

Different account objects (`SavingsAccount` and `CheckingAccount`) are stored as `BankAccount` references.  
At runtime, the correct overridden methods are called automatically.

---

## ▶️ Sample Output

=== Initial Details ===
Savings Account #SA101, Balance: 0.0, Rate: 2.0%
Checking Account #CA202, Balance: $0.0, Limit: $500.0
Overdraft Used

=== Final Details ===
Savings Account #SA101, Balance: 204.0, Rate: 2.0%
Checking Account #CA202, Balance: $-100.0, Limit: $500.0


---

## 🛠️ How to Run

1. Compile all files:

2. Run:

---

## 🎯 Concepts Used

- Encapsulation
- Inheritance
- Polymorphism
- Abstract Classes
- Method Overriding
- ArrayList
- instanceof and Type Casting

