public class SumOfTwoConsecutiveNumbers {
    public static void main(String[] args) {
        int[] a = {11,34,23,67,45,33,21};
        for (int i=0, j=1; j<a.length; i++,j++){
            int sum = a[i]+ a[j];
            System.out.println("sum:" + sum);
        }
        System.out.println("----------");
        for ( int i =0 ; i< a .length;i++) {
            int i1 = a[i];
            int sum = i1 + a [i];
            System.out.println("sum:" + sum);
        }
    }
}
