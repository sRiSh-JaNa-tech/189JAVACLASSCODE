class Employee{
    int Emp_id;
    String Emp_name;
    static String Organisation="KIET";
    
    void details(){
        System.out.println("  Emp ID: " +Emp_id +"\n"+"  Name: "+Emp_name+"\n"+"  Organisation: "+Organisation);
    }
}

class Faculty extends Employee{
    String Department;
    String subject;
    String Designation;
    void facultyDetails(){
        System.out.println("  Department: "+Department +"\n"+"  Subject: "+subject+"\n"+"  Designation:"+Designation);
    }  
    
}
class ResearchFaculty extends Faculty{
    String researchArea;
    int paperPublished;

    void researchDetails(){
        System.out.println(Emp_name +" has been published "+paperPublished +" papers in "+researchArea+ " domain.");
    }
}



public class InheritanceMultiLevel {

    public static void main(String[] args) {

    Faculty f = new Faculty();
    f.Emp_id=101;
    f.Emp_name="Deepak Kumar";
    f.Department="AIML";
    f.subject="Maths";
    f.Designation="Assitant Professor";

    System.out.println("Details of the Faculties are:");    
    f.details();
    f.facultyDetails();

    System.out.println("--------------------------------------");

    ResearchFaculty rf1=new ResearchFaculty();
    rf1.Emp_id=999;
    rf1.Emp_name="Akhilesh";
    rf1.Department="Pharma";
    rf1.Designation="Associate Professor";
    rf1.researchArea="\"Pharma Industry in Pollution\"";
    rf1.paperPublished=10;

    rf1.details();                //Common details
    rf1.facultyDetails();          //Details as a faculty
    rf1.researchDetails();       //Details as a research faculty

        
    }
    
}
