package Unit3;
import java.util.*;
public class JV {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>();
        vec.add(12);
        vec.add(13);
        vec.add(14);
        vec.add(15);
        vec.addElement(16);
        System.out.println(vec.capacity());
        System.out.println(vec);
        System.out.println(vec.remove(vec.indexOf(14)));
        System.out.println(vec);
    }
}
