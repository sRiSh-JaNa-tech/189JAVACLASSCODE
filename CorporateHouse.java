import java.util.*;
abstract class BankAccount{
    String bankName;
    int accountNumber;
    String accountHolderName;
    private double balance;
    private String accountType;
    private long phoneNumber;

    void setBank(String bankName) {
        this.bankName = bankName;
    }
    BankAccount(){
        this.bankName = "unknown";
    }
    BankAccount(int accountNumber, String accountHolderName, double balance, String accountType, long phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        if(phoneNumber > 999999999 && phoneNumber < 10000000000L){
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Invalid phone number");
        }
    }
    public int getAccountNumber() { return accountNumber;}
    public String getAccountHolderName() { return accountHolderName; }
    public double getBalance() { return balance; }
    public String getAccountType() { return accountType; }
    public long getPhoneNumber() { return phoneNumber; }
    public String getBankName() { return bankName; }
    public void updatebalance(double balance){
        this.balance = balance;
    }
    public void displayAccountDetails(){
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder Name: " + getAccountHolderName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Account Type: " + getAccountType());
        System.out.println("Phone Number: " + getPhoneNumber());
    }
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        transaction.processTransaction();
    }
    public void displayTransactions() {
        for (Transaction transaction : transactions) {
            transaction.displayTransactionDetails();
            System.out.println("-----------------------");
        }
    }
}

abstract class Transaction {
    private BankAccount account; 
    private UUID transactionId;
    private String transactionType;
    private double amount;
    private Date date;

    Transaction(BankAccount account, String transactionType, double amount) {
        this.account = account;               // store the account
        this.transactionId = UUID.randomUUID();
        this.transactionType = transactionType;
        this.amount = amount;
        this.date = new Date();
    }
    public BankAccount getAccount(){
        return account;
    }
    public double getAmount() {
        return amount;
    }
    abstract void processTransaction();

    public void displayTransactionDetails() {
        System.out.println("Bank Name: " + account.getBankName());   // use account reference
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date);
    }
}

class DepositTransaction extends Transaction{
    DepositTransaction(BankAccount account, String transactionType, double amount) {
        super(account,transactionType,amount);
    }
    @Override
    void processTransaction() {
        System.out.println("Processing deposit transaction...");
        BankAccount account = getAccount();
        try{
            if(account.getBalance() >= 0){
                double newBalance = account.getBalance() + getAmount();
                account.updatebalance(newBalance);
                System.out.println("Deposit successful. New balance: " + account.getBalance());
            }else{
                throw new IllegalArgumentException("Invalid balance");
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

class WithdrawTransaction extends Transaction{
    WithdrawTransaction(BankAccount account, String transactionType, double amount) {
        super(account,transactionType,amount);
    }
    @Override
    void processTransaction() {
        System.out.println("Processing withdraw transaction...");
        BankAccount account = getAccount();
        try{
            if(account.getBalance() >= getAmount()){
                double newBalance = account.getBalance() - getAmount();
                account.updatebalance(newBalance);
                System.out.println("Withdraw successful. New balance: " + account.getBalance());
            }else{
                throw new IllegalArgumentException("Invalid balance");
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

// Concrete Method
class Account extends BankAccount{
    private List<Transaction> transactions = new LinkedList<>();
    Account(int accountNumber, String accountHolderName, double balance, String accountType, long phoneNumber) {
        super(accountNumber, accountHolderName, balance, accountType, phoneNumber);
    }
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        transaction.processTransaction();
    }
    public void displayTransactions() {
        for (Transaction transaction : transactions) {
            transaction.displayTransactionDetails();
            System.out.println("-----------------------");
        }
    }
}

class Bank extends BankAccount{
    private Map<String, List<BankAccount>> accounts = new HashMap<>();
    String BankName;
    Bank(String BankName) {
        this.BankName = BankName;
    }
    public void addAccount(BankAccount acc) {
        acc.setBank(BankName);
        accounts.putIfAbsent(BankName, new ArrayList<>());
        accounts.get(BankName).add(acc);
    }
    public void displayAllAccounts() {
        if (accounts.containsKey(BankName)) {
            for (BankAccount acc : accounts.get(BankName)) {
                acc.displayAccountDetails();
                System.out.println("-----------------------");
            }
        }
    }
}

public class CorporateHouse {
    public static void main(String[] args) {
        Bank HDFC = new Bank("HDFC");
        BankAccount acc1 = new Account(101, "Alice", 5000, "Savings", 9876543210L);
        BankAccount acc2 = new Account(102, "Bob", 8000, "Savings", 9123456789L);
        HDFC.addAccount(acc1);
        HDFC.addAccount(acc2);
        System.out.println("===== All Bank Accounts =====");
        HDFC.displayAllAccounts();
        System.out.println("\n===== Transactions =====");
        DepositTransaction dep1 = new DepositTransaction(acc1, "Deposit", 2000);
        acc1.addTransaction(dep1);
        WithdrawTransaction with1 = new WithdrawTransaction(acc1, "Withdraw", 1500);
        acc1.addTransaction(with1);
        // Deposit 3000 to Bob
        DepositTransaction dep2 = new DepositTransaction(acc2, "Deposit", 3000);
        acc2.addTransaction(dep2);
        // Withdraw 1000 from Bob
        WithdrawTransaction with2 = new WithdrawTransaction(acc2, "Withdraw", 1000);
        acc2.addTransaction(with2);
        // Display updated account details
        System.out.println("\n===== Updated Account Details =====");
        HDFC.displayAllAccounts();
        // Display transaction history for each account
        System.out.println("\n===== Alice's Transactions =====");
        acc1.displayTransactions();
        System.out.println("\n===== Bob's Transactions =====");
        acc2.displayTransactions();
    }
}
