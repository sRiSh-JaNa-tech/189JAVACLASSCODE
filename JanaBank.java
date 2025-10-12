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
    public static void main(String[] args) {
        // Create a new account
        BankAccount.MAcc acc = new  BankAccount.MAcc("A123", "Srish Jana", 5000.0, "Savings", "9876543210");

        // Access account details
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Account Holder: " + acc.getAccountHolderName());
        System.out.println("Account Type: " + acc.getAccountType());
        System.out.println("Phone: " + acc.getPhoneNumber());

        // Deposit and withdraw
        acc.deposit(1500);
        acc.withdraw(2000);
        acc.withdraw(6000); // insufficient funds
    }
}
