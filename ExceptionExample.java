public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);

        try{
        System.out.println(100/0); //risk code
        System.out.println(7); //no printing of this
        }
        catch(Exception e){
            System.out.println("Dividing by zero.");
            System.out.println(e);
        }
        System.out.println(5);
        System.out.println(6);
    }
}