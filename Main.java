public class Main {
    public static void main(String[] args) {
        // Test Savings Account
        SavingsAccount savings = new SavingsAccount("John", "Doe", 
            "123 Main St", "555-1234", 5000.0, 3.5);
        
        System.out.println("=== Savings Account ===");
        System.out.println(savings);
        System.out.println();
        
        // Test Checking Account
        CheckingAccount checking = new CheckingAccount("Jane", "Smith", 
            "456 Oak Ave", "555-5678", 3000.0);
        
        System.out.println("=== Checking Account ===");
        System.out.println("Initial: " + checking.getBalance());
        
        // Perform transactions
        checking.credit(500.0);
        checking.withdraw(200.0);
        checking.credit(300.0);
        checking.withdraw(100.0); // This should incur a fee
        
        System.out.println("After 4 transactions: " + checking.getBalance());
        System.out.println(checking);
    }
}