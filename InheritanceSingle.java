class Employee{
    String email_id;
    String name;
    String org;
    Employee(String email_id, String name, String org){
        this.org = "KIET";
        this.email_id = email_id;
        this.name = name;
    }
}
class Faculty extends Employee{
    String dept;
    String subject;
    Faculty(String dept, String subject){
        this.dept =         this.subject = "OOP";
    }
}
public class InheritanceSingle {
    static public void main(String[] args){ 
        Faculty f = new Faculty();

    }
}
