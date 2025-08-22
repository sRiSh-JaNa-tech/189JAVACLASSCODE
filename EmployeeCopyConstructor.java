public class EmployeeCopyConstructor {
    int emp_id;
    String emp_name;
    // Original constructor
    public EmployeeCopyConstructor(String name, int id) {
        emp_id = id;
        emp_name = name;
    }
    // Copy constructor
    public EmployeeCopyConstructor(EmployeeCopyConstructor emp) {
        emp_id = emp.emp_id;
        emp_name = emp.emp_name;
    }
    void printInfo() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
    }
    public static void main(String[] args) {
        // Creating an object of EmployeeCopyConstructor
        EmployeeCopyConstructor emp1 = new EmployeeCopyConstructor("Moe Lester", 101);
        emp1.printInfo();
        // Creating a copy of emp1 using the copy constructor
        EmployeeCopyConstructor emp2 = new EmployeeCopyConstructor(emp1);
        emp2.printInfo();
    }
}