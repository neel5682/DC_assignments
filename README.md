# Distributed Computing Assignment 1

## Banking System Implementation

**Student ID:** 22mcce14  
**Name:** Neel Kamal

### Project Overview
This Java project implements a complete banking system demonstrating Object-Oriented Programming principles including inheritance, encapsulation, and polymorphism.

### 📁 Files Structure

#### Source Code
- BankAccount.java - Abstract base class for all account types
- SavingsAccount.java - Savings account with interest calculation
- CheckingAccount.java - Checking account with transaction fee system
- Main.java - Demonstration and test class

#### Documentation
- program_output.txt - Program execution output and results
- ank_account_code.txt - Code for LaTeX documentation
- savings_account_code.txt - Code for LaTeX documentation  
- checking_account_code.txt - Code for LaTeX documentation
- main_code.txt - Code for LaTeX documentation

### 🎯 Key Features Implemented

- **Inheritance Hierarchy**: BankAccount → SavingsAccount & CheckingAccount
- **Encapsulation**: Private variables with public getters/setters
- **Polymorphism**: Method overriding (toString())
- **Method Overloading**: Multiple credit()/withdraw() methods in CheckingAccount
- **Transaction System**: Fee application after free transactions
- **Interest Calculation**: For savings accounts

### 🚀 How to Run

\\\ash
# Compile all Java files
javac *.java

# Run the main program
java Main
\\\

### 📊 UML Class Diagram

The system follows a hierarchical design:
- **BankAccount** (abstract base class)
  - **SavingsAccount** (adds interest rate functionality)
  - **CheckingAccount** (adds transaction fee system)

### 📋 Sample Output

\\\
=== Savings Account ===
Name: John Doe
Address: 123 Main St
Phone: 555-1234
Balance: .0
Interest Rate: 3.5%
Interest Amount: .0

=== Checking Account ===
Initial: 3000.0
After 4 transactions: 3498.0
Name: Jane Smith
Address: 456 Oak Ave
Phone: 555-5678
Balance: .0
Transaction Count: 4
Free Transactions Left: 0
\\\

### 👨‍💻 Author
Neel Kamal (22mcce14)

### 📚 Course
Distributed Computing
