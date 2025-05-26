import java.util.ArrayList;

public class MinAndMaxArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(17);
        list1.add(89);
        list1.add(98);
        list1.add(92);
        list1.add(73);
        list1.add(17);
        list1.add(92);
        list1.add(73);
        Max(list1);
        Min(list1);
    }
    private static void Max(ArrayList<Integer> a){
        int Max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            int e1= a.get(i);
            if (e1>Max){
                Max=e1;
            }
        }
        System.out.println("The Highest value is " +Max);
    }
    private static void Min(ArrayList<Integer> a){
        int Min = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            int e1= a.get(i);
            if (e1<Min){
                Min=e1;
            }
        }
        System.out.println("The Lowest value is " +Min);
    }
}
