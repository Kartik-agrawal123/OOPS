package OOPS;
import java.util.*;
public class Array_list_collection {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
       // ArrayList<Integer> l2 = new ArrayList<>(3);
        //ADD ELEMENT
        l1.add(6);
        l1.add(1);
        l1.add(4);
        l1.add(15);
       // l1.set(1,5);
        l1.trimToSize();
       // System.out.println(l2.size()+" "+l1.size());
        // System.out.println(l1.indexOf(-10));
        for (Integer i : l1) {
            System.out.print(i + ",");
        }

    }
}
