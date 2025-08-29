import java.util.*;
class EmployeeEncap{
    private int Account_balance;
    private int upi_pin = 1234;
    //Setter method to set the balance only if the correct PIN is provided
    public void setBalance(int balance){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter UPI PIN: ");
        int pin=sc.nextInt();
        if(pin==upi_pin){
            Account_balance=balance;
            System.out.println("Balance Updated Successfully");
        }
        else{
            System.out.println("Incorrect PIN");
        }
    }
    //Getter method to get the balance
    public void GetBalance(){
        System.out.println("Account Balance: " + Account_balance);
    }
}
class Encapsulation{
    public static void main(String args[]){
        EmployeeEncap e1 = new EmployeeEncap();
        e1.setBalance(5000);
        e1.GetBalance();
    }
}