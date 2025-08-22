import java.util.Random;
public class rand {
    public static void main(String[] args){
        Random random = new Random();
        int number = random.nextInt(1,6);
        double number1 = random.nextDouble(0,6);
        boolean number2 = random.nextBoolean();
        System.out.println(number2);
        System.out.println(number);
        System.out.println(number1);
    }
}
