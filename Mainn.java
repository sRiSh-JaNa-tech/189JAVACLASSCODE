import java.util.Scanner;
class Employee {
    String name;
    double salary;
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        salary = sc.nextDouble();
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        sc.close();
    }
}
public class Mainn {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getDetails();
    }
}
