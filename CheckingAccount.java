public class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 2.0;
    private static final int FREE_TRANSACTIONS = 3;
    private int transactionCount;
    
    public CheckingAccount(String name, String surname, String address, 
                          String phoneNumber, double balance) {
        super(name, surname, address, phoneNumber, balance);
        this.transactionCount = 0;
    }
    
    public int getTransactionCount() { return transactionCount; }
    
    @Override
    public void credit(double amount) {
        super.credit(amount);
        transactionCount++;
        applyTransactionFee();
    }
    
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        transactionCount++;
        applyTransactionFee();
    }
    
    public void credit(double amount, boolean applyFee) {
        super.credit(amount);
        if (applyFee) {
            transactionCount++;
            applyTransactionFee();
        }
    }
    
    public void withdraw(double amount, boolean applyFee) {
        super.withdraw(amount);
        if (applyFee) {
            transactionCount++;
            applyTransactionFee();
        }
    }
    
    private void applyTransactionFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            super.withdraw(TRANSACTION_FEE);
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nTransaction Count: " + transactionCount +
               "\nFree Transactions Left: " + Math.max(0, FREE_TRANSACTIONS - transactionCount);
    }
}