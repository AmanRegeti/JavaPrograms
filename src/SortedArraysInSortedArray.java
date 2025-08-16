import java.util.Arrays;

public class SortedArraysInSortedArray {
    public static void main(String[] args) {
        //3,4,6,7,8,10,12,14,15,17,19,20
        int[] a = {3, 7, 8, 10, 14, 20};
        int[] b = {4, 6, 12, 15, 17, 19};
        int[] c = {1, 2, 5, 9, 11, 13, 16, 18};

        int[] MergedArray = sortArray(a, b);
        System.out.println(Arrays.toString(MergedArray));
        System.out.println("hi");
    }

    private static int[] sortArray(int[] a, int[] b) {
        int[] MergedArray = new int[a.length + b.length];
        int count = 0;
        int length = b.length;
        int i = 0;
        int j=0;
        if (a.length >= b.length) {
            length = a.length;

        }
        for (i < length && j < length; ) {
            int e1 = a[i];
            int e2 = b[j];
            if (e1 <= e2) {
                MergedArray[count] = e1;
                i++;
                count++;
            } else {
                MergedArray[count] = e2;
                j++;
                count++;
            }

        }
        if (i<j){
            MergedArray[count] = a[i];
        }else{

        return MergedArray;
    }
}
