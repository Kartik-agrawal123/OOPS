package OOPS;

import java.util.ArrayDeque;

public class ArrayDequeue_Collection {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(25);
        ad.addLast(19);
        ad.offerFirst(55);
        for(Integer i:ad){
            System.out.print(i+" ");
        }
    }
}
