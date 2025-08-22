public class EmployeeStatic {
    int Emp_id;
    static String Org;
    static{
        Org = "Bro Code";
    }
    void display(){
        System.out.println(Emp_id + " " + Org);
    }
    static public void main(String[] args){ 
        
    }
    class faculty extends EmployeeStatic{
        int salary;
        void show(){
            System.out.println(Emp_id + " " + Org + " " + salary);
        }
    }
}
