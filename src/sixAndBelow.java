public class sixAndBelow {
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 7, 4};
        int[] b = {5, 4, 8, 2, 4};
    }

    private static int find6(int[] a) throws No6Exception {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 6) {
                return i;
            }
        }
        throw new No6Exception("There is no 6 in this exception");
    }

    private static int checkIfSmaller(int e1, int[] b) {
        int sum = 0;
        for (int j = 0; j < b.length; j++) {
            int e2 = b[j];
            if (e1 > e2) {
                sum = Sum(e1, e2);
            }
        }
        System.out.println(sum);
        return sum;
    }

    private static int Sum(int e1, int e2) {
        int sum = e1 + e2;
        return sum;
    }

    private static void numbersBefore6(int index, int[] a, int[] b) {
        for (int i = 0; i < index; i++) {
            int e1 = a[i];
            int sum = 0;
            checkIfSmaller(e1,b);
        }
    }
}