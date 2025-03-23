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
            boolean isDone = false;
            int sum = a[i] + a[i - 1];
            int FSum = sum;
            int Fsum = findSmaller(a, i, sum, FSum, isDone);
            if (isDone || Fsum == -1) {
                if (i != a.length - 1) {
                    System.out.println("No smaller");
                }
            }
            if (i == a.length - 1) {
                System.out.println(sum);
            }

        }
    }

    private static int findSmaller(int[] a, int i, int FSum, int sum, boolean isDone) {
        for (int j = i + 1; j < a.length; j++) {
            int a1 = a[j];
            boolean isSmall = isSmall(a1, sum);// pass by value
            if (isSmall) {
                FSum = FSum + a1;
                System.out.println(FSum);
                isDone = true;
                return FSum;


            } /*else if (i == a.length) {
                System.out.println(sum);
            }
            if (a.length - 2 == i) {
                System.out.println(FSum);
                return FSum;
            }*/
        }
        return -1;
    }

    private static boolean isSmall(int a1, int sum) {
        return a1 < sum;
    }


}
