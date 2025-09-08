class invalidEmpID extends Exception{ //(checked exc)                                     //this
    invalidEmpID(String msg){                                                             //is user defined        
        super(msg); // exception class msg (parent class)                                 //exception
        //super(variable) is used to access/print the variable of parent class
    }
}
class Emp_loyee{
    int id;
    String name;
    Emp_loyee(int id,String n) throws invalidEmpID{ 
        //yha constructor me obj creation k time hum id ko input krenge tbhi invalid id ki error askti h, that's why constructor of employee class me humne throws (warning) di h
        if(id<=0){
            throw new invalidEmpID("Must be positive id.");
        }
        this.id=id;
        name=n;
        System.out.println("Employee created: "+id+" "+name);
    } 
}
//tester class
public class exceptionUserDefined {
    public static void main(String[] args) {
        try{
            Emp_loyee m=new Emp_loyee(101, "Ak"); //valid
            Emp_loyee e=new Emp_loyee(0, "Vanshika"); //invalid
            //agr invalid wli line valid se phle dete to valid wli bhi print nhi hoti cuz error k bad vo terminate hojata h
        }
        catch(invalidEmpID e){
            System.out.println("Custom Exception: "+e);
        }
    }
    
}