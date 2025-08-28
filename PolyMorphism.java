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

class FacultyPoly extends EmployeePoly{
    String Department;
    String subject;
    String Designation;
    void facultyDetails(){
        super.details();
        System.out.println("  Department: "+Department +"\n"+"  Subject: "+subject+"\n"+"  Designation:"+Designation);
    } 
}

public class PolyMorphism {
    public static void main(String[] args) {
        EmployeePoly e = new EmployeePoly();
        e.Emp_name="Deepak Kumar";
        //Compile time polymorphism
        e.details();
        e.details(25000);
        e.details("KIET");
    }
}
