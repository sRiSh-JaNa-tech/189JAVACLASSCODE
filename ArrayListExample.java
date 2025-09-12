import java.util.ArrayList;
import java.util.Collections;


public class ArrayListExample {

    public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("grapes");
        // fruits.add(123);
        fruits.add("22.5");
//using List only
        System.out.println(fruits);


// using for each
        // for(String s:fruits){
        //     System.out.println(s);
        // }

        fruits.add(1,"Guava");
          System.out.println(fruits);

        System.out.println(fruits.get(3));
        System.out.println(fruits.set(1,"ABC"));
        System.out.println(fruits);

// by iterator
        // Iterator itr = fruits.iterator();
        // while(itr.hasNext()){
        //   System.out.println(itr.next());
        // }

        fruits.remove(2);
        System.out.println(fruits);

      System.out.println((fruits.contains("Apple")));

      Collections.sort(fruits);
      System.out.println(fruits);

      System.out.println((Collections.binarySearch(fruits,"Apple")));

      fruits.clear();
      System.out.println(fruits);
   
    }
}