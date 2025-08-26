import java.util.Arrays;

public class SortedArraysInSortedArray {
    public static void main(String[] args) {
        //3,4,6,7,8,10,12,14,15,17,19,20
        int[] a = {3, 7, 8, 10, 14, 20, 25, 45, 54, 76, 90};
        int[] b = {4, 6, 12, 15, 17, 19};
        int[] c = {1, 2, 5, 9, 11, 13, 16, 18};
        int[] FinalArray = sortArray2(a, b, c);
        System.out.println(Arrays.toString(FinalArray));


    }


    ////    private static int[] sortArray(int[] a, int[] b,) {
////        int[] MergedArray = new int[a.length + b.length];
////        int count = 0;
////        int k=0;
////        int i = 0;
////        int j=0;
////        for (;i < a.length && j < b.length;count++) {
////            int e1 = a[i];
////            int e2 = b[j];
////            if (e1 <= e2) {
////                MergedArray[count] = e1;
////                i++;
////
////            } else {
////                MergedArray[count] = e2;
////                j++;
////
////            }
////
////        }
//        for (; j < b.length; ) {
//            MergedArray[count] = b[j];
//            count++;
//        }
//        for (; i < a.length; i++) {
//            MergedArray[count] = a[i];
//            count++;
//        }
//        return MergedArray;
//    }
    private static int[] sortArray2(int[] a, int[] b, int[] c) {
        int[] MergedArray = new int[a.length + b.length + c.length];
        int count = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length && k < c.length) {
            int e1 = a[i];
            int e2 = b[j];
            int e3 = c[k];
            if (e1 <= e2 && e1 <= e3) {
                MergedArray[count] = a[i];
                count++;
                i++;
            } else if (e2 <= e1 && e2 <= e3) {
                MergedArray[count] = b[j];
                count++;
                j++;
            } else {
                MergedArray[count] = c[k];
                count++;
                k++;
            }

        }
        /*WhileLoop(MergedArray, a, count, i);
        WhileLoop(MergedArray, b, count, j);
        WhileLoop(MergedArray, c, count, k);*/
//        if (a[i] <= b[j] && a[i] <= c[k]) {
//            while (i < a.length) {
//                MergedArray[count] = a[i];
//                count++;
//                i++;
//            }
//        } else if (b[j] <= a[i] && b[j] <= c[k]) {
//            while (j < b.length) {
//                MergedArray[count] = b[j];
//                count++;
//                j++;
//            }
//        }
//        else {
//            while (k < c.length) {
//                MergedArray[count] = c[k];
//                count++;
//                k++;
//            }
//        }

//        while (j < b.length && k < c.length) {
//            if (b[j] < c[k]) {
//                MergedArray[count] = b[j];
//                count++;
//                j++;
//            } else {
//                MergedArray[count] = c[k];
//                count++;
//                k++;
//            }
//        }
//
//
//        while (i < a.length && k < c.length) {
//            if (a[i] < c[k]) {
//                MergedArray[count] = a[i];
//                count++;
//                i++;
//            } else {
//                MergedArray[count] = c[k];
//                count++;
//                k++;
//            }
//        }
//
//
//        while (i < a.length && j < b.length) {
//            if (a[i] < b[j]) {
//                MergedArray[count] = a[j];
//                count++;
//                i++;
//            } else {
//                MergedArray[count] = b[j];
//                count++;
//                j++;
//            }
//        }
        count= mergeTwoArrays( MergedArray, a,count,i,  b,j);
        count=mergeTwoArrays( MergedArray, b,count,j,  c,k);
        count=mergeTwoArrays( MergedArray, c,count,k,  a,i);
        count=mergeRemainingArray(MergedArray, a, count, i);
        count =mergeRemainingArray(MergedArray, b, count, j);
        count=mergeRemainingArray(MergedArray, c, count, k);


        return MergedArray;
    }

    private static int mergeRemainingArray(int[] mergedArray, int[] array, int count, int index) {
        while (index < array.length&& count<mergedArray.length) {
            mergedArray[count] = array[index];
            count++;
            index++;
        }
        return count;
    }

    private static int mergeTwoArrays(int[] mergedArray, int[] array, int count, int index, int[] array2, int index2) {
        while (index < array.length && index2 < array2.length) {
            if (array[index] < array2[index2]) {
                mergedArray[count] = array[index];
                count++;
                index++;
            } else {
                mergedArray[count] = array2[index2];
                count++;
                index2++;
            }
        }
        return count;
    }
}

