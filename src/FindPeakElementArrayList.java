import java.util.ArrayList;

public class FindPeakElementArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(17);
        list1.add(89);
        list1.add(36);
        list1.add(73);
        list1.add(98);
        list1.add(92);
        list1.add(73);
        FindPeak(list1);
    }

    private static void FindPeak(ArrayList<Integer> a) {
        for (int i = 1; i < a.size() - 1; i++) {
            int e1 = a.get(i);
            int e2 = a.get(i - 1);
            int e3 = a.get(i + 1);
            if (e1 > e2 && e1 > e3) {
                System.out.println(e1);
            }
        }
    }
}
