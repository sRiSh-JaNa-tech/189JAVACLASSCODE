import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new java.util.HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Displaying the HashMap
        System.out.println("HashMap: " + map);

        // Accessing a value using its key
        int ageOfBob = map.get("Bob");
        System.out.println("Age of Bob: " + ageOfBob);

        // Removing a key-value pair
        map.remove("Alice");
        System.out.println("HashMap after removing Alice: " + map);

        // Iterating through the HashMap
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
