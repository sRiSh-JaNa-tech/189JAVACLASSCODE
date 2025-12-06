package Threads;
import java.util.*;
public class Threads02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();
        // String dayTime = switch(day){
        //     case 1 -> "Monday";
        //     case 2 -> "Tuesday";
        //     case 3 -> "Wednesday";
        //     case 4 -> "Thursday";
        //     case 5 -> "Friday";
        //     case 7 -> "Sunday";
        //     default -> "Invalid day number!";
        // };
        int hello = switch(day){
            case 2 -> 28;
            default -> {
                if(day % 2 == 0){
                    yield 30;
                }
                else{
                    yield 31;
                }
            }
        };
        System.out.println("Day : " + hello);
    }
}
