import java.util.Arrays;

public class SortingAnArraySelectionSort {
    public static void main(String[] args) {
        int[] a={7,4,1,5,3};
       // SortingTheArray(a);
        //SelectionSort(a);
        BubbleSort(a);
    }

    private static void SortingTheArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
                int lvIndex = lowestValue(a, i);
                int temp=a[i];
                a[i]=a[lvIndex];
                a[lvIndex]=temp;
        }
        System.out.println(Arrays.toString(a));
    }

    private static int lowestValue(int[] a, int j) {
        int lv = a[j];
        int lvIndex=j;
        for (int i = j; i < a.length; i++) {
            if (a[i] < lv) {
                lv = a[i];
                lvIndex++;
            }
        }
        return lvIndex;
    }
    private static void SelectionSort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            int lvIndex=i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[lvIndex]) {
                    lvIndex = j;
                }
            }
            int temp=a[i];
            a[i]=a[lvIndex];
            a[lvIndex]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
    private static void BubbleSort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
