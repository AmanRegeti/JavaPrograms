public class MidSum {
    public static void main(String[] args) {
        {
            int[] a = {11, 34, 23, 67, 45, 33, 21, 75, 42};
            int sum = 0;
            System.out.println("sum for odd number of elements");
            int mid = (a.length - 1) / 2;
            for (int i = 0, j = a.length - 1; i <= mid; i++, j--) {
                if (i != j) {
                    sum = a[i] + a[j];
                    System.out.println("sum:" + sum);
                }
                else
                {
                    //sum = a[j];
                    sum = a[i];
                    //sum = (a[i] +a[j])/2;
                    System.out.println("sum:" + sum);
                }

            }
        }
        System.out.println("--------------");
        {
            int[] a = {11, 34, 23, 67, 45, 33, 21, 75, 42, 91};
            System.out.println("sum for even number of elements");
            int mid = (a.length - 1) / 2;
            for (int i = 0, j = a.length - 1; i <= mid; i++, j--) {
                int sum = a[i] + a[j];
                System.out.println("sum:" + sum);
            }
        }
    }
}