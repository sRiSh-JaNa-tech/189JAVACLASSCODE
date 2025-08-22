package Kiet;

public class EmployeeKiet {
    public String Emp_name;
    private int Salary;
    protected int Emp_id;
    public String Org_name;
    public EmployeeKiet(String emp_name, int salary, int emp_id, String org_name) {
        this.Emp_name = emp_name;
        this.Salary = salary;
        this.Emp_id = emp_id;
        this.Org_name = org_name;
    }
    void printDetails() {
        System.out.println("Employee Name: " + Emp_name);
        System.out.println("Salary: " + Salary);
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Organization Name: " + Org_name);
    }

    public static void main(String[] args) {
        EmployeeKiet emp = new EmployeeKiet("Hobbs Dawson", 50000, 12345, "Mechanical");
        emp.printDetails();
    }
}
