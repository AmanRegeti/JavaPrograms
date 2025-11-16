import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        HashSet b = new HashSet();
        b.add(1);
        b.add(3);
        b.add(2);
        b.add(9);
        b.add(5);
        b.add(6);
        b.add(7);
        Set a = new TreeSet<>(b);
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
