class EmployeePoly{
    String Emp_name;
    void details(){
        System.out.println("Employee Name: "+Emp_name);
    }
    void details(int salary){
        System.out.println("Employee Salary: "+ salary);
    }
    void details(String CompanyName){
        System.out.println("Employee ID: "+ CompanyName);
    }
}


public class PolyMorphism {
    public static void main(String[] args) {
        EmployeePoly e = new EmployeePoly();
        e.Emp_name="Deepak Kumar";
        e.details();
        e.details(25000);
        e.details("KIET");
    }
}
