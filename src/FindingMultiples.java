public class FindingMultiples {
    public static void main(String[] args) {
        int[] a = {1, 3, 12, 13, 6, 24, 15, 16, 13};
        int elements = 0;
        for (int i = 0; i < a.length; i++) {
            int element = a[i];

            System.out.println("--------------------");
            System.out.println("checking for " + element);
            for (int j = 0; j < a.length; j++) {

                if (j != i) {

                    if (a[j] % element == 0) {
                        //System.out.println("     " + a[j] + " can be divided by " + element);
                        elements++;
                        int element1 = a[j];
                        //int[] result = new int [10];
                        result[elements] = element1;
                        System.out.println(result);
                    }

                }
            }
        }
    }
}
