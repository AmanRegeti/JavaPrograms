public class SumOfTriplets {
    public static void main(String[] args) {
        int[] a = {11, 2, 5, 7, 9, 15};
        add(a);
    }

    private static void add(int[] a) {
        for (int i = 0; i < a.length - 2; i++) {
            int sum = a[i] + a[i + 1] + a[i + 2];
            System.out.println(sum);
        }
    }
    private static void add2(int[] a) {
        for (int i = 0, j=i+2; j < a.length; i++, j++) {
            int sum = a[i] + a[i + 1] + a[i + 2];
            System.out.println(sum);
        }
    }
    private static void add3(int[] a) {
        for (int i = 2; i < a.length; i++) {
            int sum = a[i] + a[i - 1] + a[i - 2];
            System.out.println(sum);
        }
    }
}
