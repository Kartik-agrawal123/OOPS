package OOPS;

import java.util.*;

public class Linked_list_collection {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(5);
        l1.add(7);
        l1.add(89);
        l1.addFirst(85);
        l1.addLast(98);
        for(Integer i : l1) {
            System.out.print(i+" ");
        }

    }
}
