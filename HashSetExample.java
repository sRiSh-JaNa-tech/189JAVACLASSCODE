import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        System.out.println("HashSet after adding elements: " + set);

        // Remove an element
        set.remove("Banana");
        System.out.println("HashSet after removing 'Banana': " + set);

        // Check if an element exists
        boolean containsApple = set.contains("Apple");
        System.out.println("Contains 'Apple'? " + containsApple);

        // Size of HashSet
        System.out.println("Size of HashSet: " + set.size());

        // Iterate over elements
        System.out.print("Iterating over HashSet: ");
        for (String fruit : set) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Clear all elements
        set.clear();
        System.out.println("HashSet after clearing: " + set);
    }
}
