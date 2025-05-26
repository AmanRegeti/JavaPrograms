import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(12);
        list1.add(13);
        list1.add(14);
        System.out.println(list1);

        int a = list1.get(0);
        System.out.println(a);

        list1.add(15);
        list1.add(16);
        System.out.println(list1);

        list1.set(2, 23);
        System.out.println(list1);

        int removed = list1.remove(3);
        System.out.println(removed);
        System.out.println(list1);
    }
}
