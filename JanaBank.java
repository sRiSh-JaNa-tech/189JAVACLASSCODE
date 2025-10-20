class BankAccount{
    protected static class Transaction {   
        protected double balance;
        Transaction(double balance) {
            this.balance = balance;
        }
        void getBalance() {
            System.out.println("Current Balance: " + balance);
        }
        void deposit(double amount){
            balance += amount;
            System.out.println("Deposited: " + amount);
            getBalance();
        }
        void withdraw(double amount){
            if(amount > balance){
                System.out.println("Insufficient funds for withdrawal of: " + amount);
            } else {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
                getBalance();
            }
        }
    }
    static class MAcc extends Transaction{
        private String accountNumber;
        private String accountHolderName;
        private String accountType;
        private String phoneNumber;
        MAcc(String accountNumber, String accountHolderName, double balance, String accountType, String phoneNumber) {
            super(balance); 
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.accountType = accountType;
            this.phoneNumber = phoneNumber;
        }
        public String getAccountNumber() {
            return accountNumber;
        }
        public String getAccountHolderName() {
            return accountHolderName;
        }
        public String getAccountType() {
            return accountType;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
    }
}
public class JanaBank {
    static java.util.List<BankAccount.MAcc> accounts = new java.util.ArrayList<>();
    static void addAccount(BankAccount.MAcc account) {
        accounts.add(account);
        System.out.println("Account added: " + account.getAccountNumber());
    }
    static void displayAccounts() {
        for (BankAccount.MAcc account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() +
                               ", Holder: " + account.getAccountHolderName() +
                               ", Type: " + account.getAccountType() +
                               ", Phone: " + account.getPhoneNumber());
        }
    }
    public static void main(String[] args) {
        // Create a new account
        BankAccount.MAcc acc1 = new  BankAccount.MAcc("A123", "Srish Jana", 5000.0, "Savings", "9876543210");
        BankAccount.MAcc acc2 = new BankAccount.MAcc("B456", "John Doe", 3000.0, "Checking", "1234567890");
        BankAccount.MAcc acc3 = new BankAccount.MAcc("C789", "Jane Smith", 7000.0, "Savings", "5555555555");
        BankAccount.MAcc acc4 = new BankAccount.MAcc("D012", "Alice Johnson", 10000.0, "Checking", "4444444444");
        addAccount(acc4);
        addAccount(acc3);
        displayAccounts();
    }
}
