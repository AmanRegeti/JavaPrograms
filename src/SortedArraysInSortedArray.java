import java.util.Arrays;

public class SortedArraysInSortedArray {
    public static void main(String[] args) {
        //3,4,6,7,8,10,12,14,15,17,19,20
        int[] a = {3, 7, 8, 10, 14, 20};
        int[] b = {4, 6, 12, 15, 17, 19};
        int[] c = {1, 2, 5, 9, 11, 13, 16, 18};
        int[] d = {21};
        int[] MergedArray = sortArray(a, b);
        int[] FinishedArray= sortArray(MergedArray,c);
        int[] FinishedArray2= sortArray(FinishedArray,d);
        System.out.println(Arrays.toString(FinishedArray2));


    }


    private static int[] sortArray(int[] a, int[] b) {
        int[] MergedArray = new int[a.length + b.length];
        int count = 0;
        int i = 0;
        int j=0;
        for (;i < a.length && j < b.length;count++) {
            int e1 = a[i];
            int e2 = b[j];
            if (e1 <= e2) {
                MergedArray[count] = e1;
                i++;

            } else {
                MergedArray[count] = e2;
                j++;

            }

        }
        for (; j < b.length; j++) {
            MergedArray[count] = b[j];
            count++;
        }
        for (; i < a.length; i++) {
            MergedArray[count] = a[i];
            count++;
        }
        return MergedArray;
    }
}
