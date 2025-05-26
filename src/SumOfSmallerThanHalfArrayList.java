import java.util.ArrayList;

public class SumOfSmallerThanHalfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(20);
        list1.add(5);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(18);
        list2.add(1);
        list2.add(6);
        list2.add(1);
        list2.add(7);
        list2.add(1);

        FindSmaller(list1, list2);
    }

    private static void FindSmaller(ArrayList<Integer> a, ArrayList<Integer> b) {
        int mid = (b.size() - 1) / 2;


        for (int i = 0; i < a.size(); i++) {
            int e1 = a.get(i);
            int sum = e1;
            if (i % 2 == 0) {
                for (int j = 0; j <= mid; j++) {
                    SumOfSmaller(mid, b, e1, sum);
                }
            } else {
                for (int j = mid+1; j < b.size(); j++) {
                    SumOfSmaller(mid,b,e1,sum);
                }

            }
            System.out.println(sum);
        }
    }

    private static int Add(int e2, int sum) {
        int fsum = sum + e2;
        return fsum;
    }
    private static void SumOfSmaller(int mid,ArrayList<Integer>b,int e1,int sum){
        for (int j = 0; j <= mid; j++) {
            int e2 = b.get(j);
            if (e1 > e2) {
                sum = Add(e2, sum);
            }
        }
    }
}
