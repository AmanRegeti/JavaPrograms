public class BiggerThanSumOfFirstTwo {
    public static void main(String[] args) {
        int[] a = {11, 2, 5, 7, 9, 15};
        sum(a);
    }

    private static void sum(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int sum=0;
            sum = a[i] + a[i - 1];
int FSum=0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] > sum) {
                     FSum = sum + a[j];
                    System.out.println(FSum);
                    break;
                }
                if (j==a.length-1){
                    System.out.println(sum);
                }
            }
        }
    }
}
