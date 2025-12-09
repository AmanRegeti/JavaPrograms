import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//hashset is not sorted
//treeset is sorted
//1st approach is taking all the elements and then sorting
//2nd approach is sorting each element one by one while inserting
// just like a TreeSet, there is a TreeMap
public class treeSet {
    public static void main(String[] args) {
        HashSet<Integer> b = new HashSet<>();
        b.add(1);
        b.add(3);
        b.add(5);
        b.add(9);
        b.add(5);
        b.add(6);
        b.add(7);
//converting the hashset to treeset
        Set<Integer> a = new TreeSet<>(b);
        System.out.println(a);
        TreeSet c = new TreeSet<>();
        c.add(1);
        c.add(3);
        c.add(2);
        c.add(9);
        c.add(5);
        c.add(6);
        c.add(7);
        System.out.println(c);
    }
}
