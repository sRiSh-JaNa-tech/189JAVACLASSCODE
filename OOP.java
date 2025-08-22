import java.util.Scanner;
class methodCode{
    String name ;
    int id;
    methodCode(){
        id = 111;
        name = "display";
    }
    public void display(){
        System.out.print(this.id + " ");
        System.out.print(this.name);    
    }
    public void display(int id,String Name){
        this.id = 190;
        this.name = "Upvan Singh";
    }

}
public class OOP {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        methodCode mt = new methodCode();
        System.out.print("Enter your age and name : ");
        mt.id = scanner.nextInt();
        mt.name= scanner.nextLine();
        mt.display();
    }           
}