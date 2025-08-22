import java.text.DecimalFormat;
import java.util.Scanner;

public  class Area {
    public static void main(String[] args) {
        // Area of a Rectangle 
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Enter Width : ");
        double width = scanner.nextDouble();
        System.out.print("Enter height : ");
        double height = scanner.nextDouble();
        double area = width * height;
        double perimeter = 2*(width + height);
        System.out.printf("%.2f%n",area);
        System.out.println(df.format(perimeter));
        scanner.close();
    }
}
