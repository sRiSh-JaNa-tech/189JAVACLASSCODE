import java.util.*;
public class PracticeArr {
    public static void main(String[] args) {
        Map<String, List<String>> School = new HashMap<>();
        Map<String, Integer> subjectsInd = Map.of(
                "Math", 0,
                "Science", 1,
                "History", 2,
                "Geography", 3
        );
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        for(int i = 0;i < 2;i++){
            System.out.print("Enter student name: ");
            String name = sc.next();
            School.put(name, new ArrayList<>(subjectsInd.size()));
            for(int j = 0;j < subjectsInd.size();j++){
                System.out.print("Enter marks in " + (String)subjectsInd.keySet().toArray()[j] + ": ");
                School.get(name).add(sc.next());
            }
        }
        for(Map.Entry<String, List<String>> e: School.entrySet()){
            System.out.println(e.getKey() + " marks : " + e.getValue());
        }
    }

}
