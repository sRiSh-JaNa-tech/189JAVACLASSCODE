
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,7,11,15);
        Map<Integer, Integer> numMap = new HashMap<>();
        int target = 9;
        int j = 0;
        for(int i = 0;i < number.size();i++){
            int comp = target - number.get(i);
            if(numMap.containsKey(comp)){
                System.out.println("Pair found: " + comp+ " + " + number.get(i)+ " = " + target);
                System.out.println("Indices: " + numMap.get(comp) + ", " + i);
                return;
            }
            else{
                numMap.put(number.get(i), j);
            }
            j++;
        }
    }
}
