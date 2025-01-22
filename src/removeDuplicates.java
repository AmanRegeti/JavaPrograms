import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] a = {11, 11, 11, 12, 13, 13, 14, 15, 16, 16, 16, 16};
        //removeDuplicates(a);
        removeDuplicates2(a);
    }

    private static void removeDuplicates(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));

    }

    private static void removeDuplicates2(int[] a) {
        int[] temp = new int[a.length];
        int next = 0;
        for (int i = 0; i<a.length;i++ ) {
        int e1 = a[i];
            boolean check = checkAnotherArray(temp, next, e1);
            if()
        }
    }

    private static boolean checkAnotherArray(int[] temp, int next, int element) {

    }
}