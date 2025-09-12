import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // 1. Create a Vector
        Vector<String> fruits = new Vector<>(); // Creates an empty Vector with default initial capacity

        // 2. Add elements to the Vector
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.addElement("Cherry"); // Another way to add elements
        fruits.add(0, "Grape"); // Add at a specific index

        System.out.println("Vector after adding elements: " + fruits);

        // 3. Access elements
        String firstFruit = fruits.firstElement(); //==fruits.get(0);
        System.out.println("First element: " + firstFruit);

        String fruitAtIndex2 = fruits.get(2); //==fruits.elementAt(2);
        System.out.println("Element at index 2: " + fruitAtIndex2);

        // 4. Check size and capacity
        System.out.println("Current size of Vector: " + fruits.size());
        System.out.println("Current capacity of Vector: " + fruits.capacity());

        // 5. Remove elements
        fruits.remove("Banana"); // Remove by object
        fruits.removeElementAt(0); // Remove by index

        System.out.println("Vector after removing elements: " + fruits);

        // 6. Iterate over elements
        System.out.print("Iterating through Vector: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 7. Clear the Vector
        fruits.clear();
        System.out.println("Vector after clearing: " + fruits);
    }
}