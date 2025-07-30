# COMP228-Lab5

# Java Bank Thread Synchronization Project

## 🧠 Description

This project is a simple Java application that demonstrates **thread synchronization** using a simulated **bank account**. It was developed as part of Lab 5 for a college-level Java programming course.

The program creates multiple threads to perform deposits and withdrawals on a shared bank account, ensuring thread-safe operations using the `synchronized` keyword.

---

## 🏗️ Structure

- `Bank.java`  
  Holds the `Bank` class with synchronized `deposit` and `withdraw` methods.

- `ThreadDeposit.java`  
  A thread class that performs deposits.

- `ThreadWithdrawal.java`  
  A thread class that performs withdrawals.

- `DriverMain.java`  
  The main driver class that:
  - Initializes the bank with $500
  - Creates 4 withdrawal threads ($100 each)
  - Creates 4 deposit threads ($50 each)

---

## 🔁 Dummy Run Details

Initial Balance: `$500`

### Transactions:
- 4 Withdrawals × $100 = -$400
- 4 Deposits × $50 = +$200

**Expected Final Balance: `$300`**

Console output confirms synchronized access and correct transaction sequence.

---

## ▶️ How to Run

1. Open the project in an IDE like IntelliJ or Eclipse.
2. Compile all `.java` files.
3. Run `DriverMain.java`.

Ensure you're using **Java 8+**.

---

## 👨‍💻 Author

**Joshua Gates**  
Centennial College  
Student ID: 301469968
