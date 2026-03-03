import java.util.LinkedList;

public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> l1 = new MyLinkedList<>();
        l1.addLast(1);
        l1.addLast(3);
        l1.addLast(4);
        MyLinkedList<Integer> l2 = new MyLinkedList<>();
        l2.addLast(2);
        l2.addLast(5);
        l2.addLast(6);
        MergeTwoSortedArray(l1, l2);
    }

    private static void MergeTwoSortedArray(MyLinkedList<Integer> l1, MyLinkedList<Integer> l2) {
        MyLinkedList<Integer> newMerge = new MyLinkedList<>();
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < l1.size() && j < l2.size()) {
            int e1 = l1.get(i);
            int e2 = l2.get(j);
            if (e1 < e2) {
                newMerge.addLast(e1);
                i++;
                k++;
            } else if (e1 > e2)
            {
                newMerge.addLast(e2);
                j++;
                k++;
            } else {
                newMerge.addLast(e1);
                i++;
                k++;
                newMerge.addLast(e2);
                j++;
                k++;
            }
        }
        addRemaining(l1,newMerge,k,i);
        addRemaining(l2,newMerge,k,j);
        System.out.println(newMerge);
    }
    private static MyLinkedList<Integer> addRemaining(MyLinkedList<Integer> list, MyLinkedList<Integer> newMerge, int k, int l){
        for (int i = l; i < list.size(); i++) {
            int e1 =  list.get(i);
            newMerge.addLast(e1);
        }
        return newMerge;
    }


}
