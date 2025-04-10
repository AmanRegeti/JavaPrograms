public class MaximumSumInArray {
    public static void main(String[] args) {
        //int[] a = {4,-100,4,-100,4,-100,4,-100};
        //int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        //int[] a = {-1,5,4,-1,7,8,2};
        //int[] a = {-2,-2,-1};
        int[] a = {1};
        FindMax(a);
    }

    private static void FindMax(int[] a) {
        int Max = a[0];
        int k=-1;
        int l=-1;
        //{ -2,1,-3,4,-1,2,1,-5,4}; 6
        for (int i = 0; i < a.length; i++) {
            int e1 = a[i];
            int cSum = e1;
            for (int j = i; j < a.length; j++) {
                int e2 = a[j];
                cSum += e2;
                if (i == j) {
                    cSum = cSum / 2;
                }
                if (cSum >= Max) {
                    Max = cSum;
                    k = i;
                    l = j;
                }

            }
        }
        System.out.println(Max);
        System.out.println(k + "-" + l);
    }
}
