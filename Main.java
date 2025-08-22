import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        scanner.nextLine(); // if any new line character error occurs then use it
        //scanner.next() - does not read any spaces 
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        System.out.print("Enter your GPA : ");
        double gpa = scanner.nextDouble();
        System.out.print("Are you a student");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is : " + gpa);
        System.out.println(isStudent);
        scanner.close();
    }
}