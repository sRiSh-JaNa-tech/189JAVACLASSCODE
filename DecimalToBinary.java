public class DecimalToBinary {
    public static void main(String[] args) {
        int decimalNumber = 42; // Example decimal number
        String binary = findBinary(decimalNumber, "");
        System.out.println("Binary representation of " + decimalNumber + " is: " + binary);
    }
    public static String findBinary(int n, String result){
        if(n == 0){
            return result;
        }
        return findBinary(n / 2, (n % 2) + result);
    } 
}
