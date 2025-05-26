import java.util.ArrayList;

public class FindingDuplicatesArrayLIst {
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
        FindDuplicates(list1);
        System.out.println(list1);
    }

    private static void FindDuplicates(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            int e1 = a.get(i);
            for (int j = 0; j < a.size(); j++) {
                int e2 = a.get(j);
                if (i!=j){
                if (e1==e2) {
                    System.out.println(e2);
                    a.remove(j);
                }
                }
            }
        }
    }

}
