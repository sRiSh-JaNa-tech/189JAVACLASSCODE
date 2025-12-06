package Unit3;

import java.util.*;

public class IteratingAL {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("apple");
		items.add("banana");
		items.add("cherry");

		// iterate using enhanced for-loop
		for (String item : items) {
			System.out.println(item);
		}

        //Through Iterators in java
        Iterator itr = items.iterator(); 
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
	}
}
