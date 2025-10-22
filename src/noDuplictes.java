import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class noDuplictes {
    public static void main(String[] args) {
        int[] a = {2, 4, 7,1,1,1,1,1,1,1,1,1,1, 1, 3, 4, 6, 7, 7,2, 4, 7,1,1,1,1,1,1,1,1,1,1, 1, 3, 4, 6, 7, 7,2, 4, 7,1,1,1,1,1,1,1,1,1,1, 1, 3, 4, 6, 7, 7};

        findingIfAndRemovingDuplicates(a);
    }

    private static void findingIfAndRemovingDuplicates(int[] a) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    int e1 = a[i];
                    int e2 = a[j];
                    if (i != j) {
                        if (e1 == e2) {
                            a[j]=0;
                        }
                    }
                }
        }
        removeZero(a);
    }
    private static void removeZero (int[] a){
        ArrayList b = new ArrayList();
        for (int i = 0; i < a.length; i++) {
           int e1= a[i];
           if (e1!=0){
                b.add(e1);
           }
        }
        System.out.println(Collections.unmodifiableList(b));
    }
}
