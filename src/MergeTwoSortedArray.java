import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {23, 25, 27, 28, 29};
        int[] b = {20, 22, 24, 26, 30};
        int maxsize = a.length + b.length;
        int[] output = new int[maxsize];

        int i =0;
        int j=0;
        int next=0;
        while(i < a.length && j < b.length) {
            int e1 = a[i];
            int e2 = b[j];
            if(e1<e2) {
                output[next]=e1;
                // put e1 in output
                i++;
                next++;
            } else if (e1 > e2){
                output[next]=e2;
                // put e2 in output
                j++;
                next++;
            } else {
                output[next]=e1;
                next++;
                output[next]=e2;
                next++;
                // put both e1 and e2 in output
                i++;
                j++;

            }
        }


        // check which on is not finished yet
        // and put that one in output

    }
    private static void approch1() {
        int[] a = {23, 25, 27, 28, 29};
        int[] b = {20, 22, 24, 26, 30};
        int maxsize = a.length + b.length;
        int[] output = new int[maxsize];
        int AMax = 0;
        int BMax = 0;
        int i = 0;
        int j = 0;

        for (int k = 0; k < maxsize; k++) {
            // if i reaches max size of A print all remaining elements of B
            // if j reaches max size of B print all remaining elements of A
            if (a[i] < b[j]) {
                output[k] = a[i];
                if (AMax == 0) {
                    if (i < a.length - 1) {
                        i++;
                    } else {
                        AMax = 1;
                    }
                }
            } else {
                if (BMax == 0) {
                    output[k] = b[j];
                    if (j < b.length - 1) {
                        j++;
                    } else {
                        BMax = 1;

                    }

                }
            }
            /*if (AMax > BMax) {
                for (int countA = i; countA<a.length; countA++) {
output[k]= a[countA];
                }
            }
            else{
                for (int countB = j; countB<b.length; countB++) {
                    output[k]= a[countB];
                }

             */
        }

        System.out.println(Arrays.toString(output));
    }
}
