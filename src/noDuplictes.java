import java.util.ArrayList;
import java.util.Arrays;

public class noDuplictes {
    public static void main(String[] args) {
        int[] a = {2, 4, 7, 1, 3, 4, 6, 7};

        findingIfAndRemovingDuplicates(a);
    }

    private static void findingIfAndRemovingDuplicates(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) b[i] = a[i];;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int e1 = a[i];
                int e2 = a[j];
                if(i != j) {
                    if (e1 == e2) {
                        b[i] = a[i];
                        b[j] = 0;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(b));
    }
    private static void moveZeroRight(int[] b){
    }
}
