public class SumOfTwoConsecutiveNumbers {
    public static void main(String[] args) {
        int[] a = {11,34,23,67,45,33,21, 75,42};
        for (int i=0, j=1; j<a.length; i++,j++){
            int sum = a[i]+ a[j];
            System.out.println("sum:" + sum);
        }
        System.out.println("----------");
        for ( int i =0 ; i< a .length-1;i++){
           int sum = a[i] + a [i + 1];
            System.out.println("sum:" + sum);
        }
        System.out.println("-------------------------");
        for ( int i=0 , j=a.length-1; i<a.length; i++, j--){
            int e1 = a[i];
            int e2 = a[j];
            int sum = e1 + e2;
            System.out.println("sum:" + sum);
        }
        System.out.println("-------------------------");
        for ( int i=0 , j=a.length-1; i<a.length; i++, j--){
            if(i == j) {
                break;
            }
            int sum = a[i] + a[j];
            System.out.println("sum:" + sum);
        }
        System.out.println("-------------------------");
        int mid = (a.length-1)/2;
        for ( int i=0 , j=a.length-1; i<mid; i++, j--){
            int sum = a[i] + a[j];
            System.out.println("sum:" + sum);
        }
        System.out.println("-------------------------");

        for ( int i=0 , j=a.length-1; i<j; i++, j--){
            int sum = a[i] + a[j];
            System.out.println("sum:" + sum);
        }
    }
}
