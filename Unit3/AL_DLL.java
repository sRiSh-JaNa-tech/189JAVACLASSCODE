package Unit3;
import java.util.*;
public class AL_DLL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        sublist.add(2);
        sublist.add(3);
        sublist.add(4);
        list.addAll(sublist);
        list.add(42);
        list.addFirst(1);
        list.addLast(9);
        System.out.println(list.get(3)); // By Index
        System.out.println(list.getFirst() + " " + list.getLast());
        System.out.println(list.remove(list.indexOf(42)));
        System.out.println(list);
    }
}
