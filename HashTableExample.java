public class HashTableExample {
    {
        public static void main(String[] args) {
            java.util.Hashtable<Integer, String> table = new java.util.Hashtable<>();

            // Add key-value pairs
            table.put(1, "Apple");
            table.put(2, "Banana");
            table.put(3, "Cherry");

            // Retrieve a value
            String value = table.get(2);
            System.out.println("Value for key 2: " + value);

            // Iterate over keys and values
            for (Integer key : table.keySet()) {
                System.out.println("Key: " + key + ", Value: " + table.get(key));
            }
        }
    }
    
}
