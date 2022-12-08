package misc.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class MySorter implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}

public class TryingTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>(new MySorter());
        treeSet.add(25);
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(21);
        treeSet.add(42);

        Iterator<Integer> values = treeSet.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }

        System.out.println("--------------------------------------");

        // print in reverse sorted manner
        Iterator<Integer> valuesDesc = treeSet.descendingIterator();
        while(valuesDesc.hasNext()){
            System.out.println(valuesDesc.next());
        }
        System.out.println("Printing elements less than 10");
        SortedSet<Integer> set = treeSet.headSet(10);
        System.out.println(set);
    }
}
