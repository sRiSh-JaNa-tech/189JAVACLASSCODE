class BankAccount1{
    int balance=5000;
    void Withdraw(int amount){
        System.out.println("Hello Customer!");
        System.out.println("Pin Verification");
        System.out.println("Hello Customer!");
        System.out.println("Pin Verification");

        synchronized(this){
        if(balance>=amount){
            System.out.println(Thread.currentThread().getName()+" is withdrawing "+amount);
            balance-=amount;
            System.out.println(Thread.currentThread().getName()+" completed withdrawal. Remaining balance: "+balance);
        }else{
            System.out.println(Thread.currentThread().getName()+" - Not enough balance!");
        }
    }
    }
}


// Thread Class
class WithdrawThreads extends Thread{
    BankAccount1 account;
    int amount;

    WithdrawThreads(BankAccount1 account, int amount){
        this.account = account;
        this.amount=amount;
    }
    public void run(){
        account.Withdraw(amount);
    }
}

public class SynchronisedExample {
    public static void main(String[] args) {
        BankAccount1 b1=new BankAccount1();
        WithdrawThreads t1=new WithdrawThreads(b1,4000 );
        WithdrawThreads t2=new WithdrawThreads(b1,3000 );
        t1.start();
        t2.start();
    }
}