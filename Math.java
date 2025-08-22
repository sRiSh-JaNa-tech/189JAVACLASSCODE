import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.DecimalFormat;
public class Math {
    public static void main(String[] args) {
        //System.out.println(java.lang.Math.PI);
        //System.out.println(java.lang.Math.E);
        // double result = java.lang.Math.sqrt(5);
        // result = java.lang.Math.round(7.89);
        // result = java.lang.Math.ceil(3.14);
        // result = java.lang.Math.floor(3.99);
        DecimalFormat df = new DecimalFormat("#.000");
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter the length of side A : ");
        a = scanner.nextDouble();
        System.out.print("ENter the length of side B : ");
        b = scanner.nextDouble();
        c = java.lang.Math.sqrt(java.lang.Math.pow(a,2) + java.lang.Math.pow(b,2));
        System.out.println("Hypotenuse : " + df.format(c));

    }
}
