package OOPS;

import java.util.HashSet;

public class HashSet_Collection {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(12);
        myHashSet.add(2);
        myHashSet.add(-1);
        myHashSet.add(1);
        myHashSet.add(0);
        myHashSet.add(5);
        System.out.print(myHashSet+" "+myHashSet.size());

    }
}
