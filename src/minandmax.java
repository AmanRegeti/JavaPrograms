public class minandmax {
    public static void main(String[] args) {
        int[] a = {89, 34, 23, 67, 45, 33, 21, 75, 42, 91};
        minMaxDifferentLoops(a);

        int[] result = minMaxInOneLoop(a);
        int hv = result[1];
        int lv = result[0];
        System.out.println("The highest value is " + hv);
        System.out.println("and");
        System.out.println("The lowest value is " + lv);
    }

    private static int[] minMaxInOneLoop(int[] a) {
        int hv = a[0];
            int lv = a[0];

            for (int i = 1; i < a.length; i++) {
                if (a[i] > hv) {
                    hv = a[i];

                }
                if (a[i] < lv) {
                    lv = a[i];
                }

            }
        int[] minandmaxarray = {lv, hv};
        return minandmaxarray;
    }

    private static void minMaxDifferentLoops(int[] a) {
        int min = findMin(a);
        int max = findMax(a);
        System.out.println("The highest value is " + max);
        System.out.println("and");
        System.out.println("The lowest value is " + min);
    }

    private static int findMax(int[] a) {
        int hv = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > hv) {
                hv = a[i];

            }
        }
        return hv;
    }

    private static int findMin(int[] a) {
        int lv = a[0];
        for (int j = 1; j < a.length; j++) {
            if (a[j] < lv) {
                lv = a[j];

            }
        }
        return lv;
    }
}