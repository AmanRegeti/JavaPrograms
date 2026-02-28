import java.util.LinkedList;

public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> l1 = new MyLinkedList<>();
        l1.addLast(4);
        l1.addLast(3);
        l1.addLast(1);
        MyLinkedList<Integer> l2 = new MyLinkedList<>();
        l1.addLast(6);
        l1.addLast(5);
        l1.addLast(2);
        MergeTwoSortedArray(l1,l2);
    }
    private static void MergeTwoSortedArray(MyLinkedList<Integer> l1, MyLinkedList<Integer> l2){
        MyLinkedList<Integer> newMerge = new MyLinkedList<>();
        int k=0;
        for (int i = 0; i <l1.size();) {
            int e1=l1.get(i);
            for (int j = 0; j < l2.size();) {
                int e2=l2.get(j);
                if (e1 < e2){
                    newMerge.addLast(k);
                }
            }
        }
        System.out.println(newMerge);
    }
}
