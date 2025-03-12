public class BiggerThanSumOfFirstTwo {
    public static void main(String[] args) {
        int[] a = {11, 2, 5, 7, 9, 15};
        sum(a);
    }
//find the sum of the first two and then find the number bigger than the sum

    private static void sum(int[] a) {
        for (int i = 1; i < a.length-2; i++) {
            boolean isDone = false;
            int sum = a[i] + a[i - 1];
            int FSum = sum;
            int Fsum = findSmaller(a, i, sum, FSum, isDone);
            if (isDone || Fsum == -1) {
                System.out.println("No smaller");
            }

        }
    }

    private static int findSmaller(int[] a, int i, int FSum, int sum, boolean isDone) {
        for (int j = i + 1; j < a.length+1; j++) {
            int a1 = a[j];
            boolean isSmall = isSmall(a1, sum);
            if (isSmall) {
                FSum = FSum + a1;
                System.out.println(FSum);
                isDone = true;
                return FSum;


            }
            if (a.length - 2 == i) {
                System.out.println(FSum);
                return FSum;
            }
        }
        return -1;
    }

    private static boolean isSmall(int a1, int sum) {
        if (a1 < sum) {
            return true;
        }
        return false;
    }


}
