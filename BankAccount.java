public abstract class BankAccount {
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;
    private double balance;
    
    public BankAccount(String name, String surname, String address, 
                     String phoneNumber, double balance) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    
    @Override
    public String toString() {
        return "Name: " + name + " " + surname + 
               "\nAddress: " + address + 
               "\nPhone: " + phoneNumber + 
               "\nBalance: $" + balance;
    }
}