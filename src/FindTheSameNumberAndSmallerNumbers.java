import java.util.ArrayList;

public class FindTheSameNumberAndSmallerNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(20);
        list1.add(5);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(18);
        list2.add(3);
        list2.add(6);
        list2.add(7);
        list2.add(5);
        list2.add(1);
        find(list1, list2);

    }

    private static void find(ArrayList<Integer> a, ArrayList<Integer> b) {
        for (int i = 0; i < a.size(); i++) {
            int e1 = a.get(i);
            int sum = e1;
            for (int j = 0; j < b.size(); j++) {

                int e2 = b.get(j);
                if (e1 == e2) {
                    sum = SumOfSmaller(j, b, a, e1, sum);
                }
            }
            System.out.println(sum);
        }
    }

    private static int SumOfSmaller(int index, ArrayList<Integer> b, ArrayList<Integer> a, int e1,int sum) {
        for (int i = index; i < b.size(); i++) {
            int e2 = b.get(i);
            if (e1 > e2) {
                sum += e2;
            }
        }
        return sum;
    }
}
