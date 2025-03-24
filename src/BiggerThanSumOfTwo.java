// take two consecutive numbers in an array, add them and find a number smaller than the sum and add them.
public class BiggerThanSumOfTwo {
    public static void main(String[] args) {
        // take two numbers in a row
        int[] a = {11, 2, 5, 7, 9, 15};
        sum(a);
    }
//find the sum of the first two and then find the number bigger than the sum

    private static void sum(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int sum = a[i] + a[i - 1];
            int fSum = findSmaller(a, i, sum);
            System.out.println(fSum);

        }
    }

    private static int findSmaller(int[] a, int start, int sum) {
        int fSum= sum;
        for (int j = start + 1; j < a.length; j++) {
            int a1 = a[j];

            boolean isSmall = isSmall(a1, sum);// pass by value
            if (isSmall) {
                fSum=add(sum, a1);
            }
        }
        return fSum;
    }

    private static boolean isSmall(int a1, int sum) {
        return a1 < sum;
    }

    private static int add(int sum, int a1) {
        int finalSum = sum + a1;
        //System.out.println(finalSum);

        return finalSum;
    }
}
