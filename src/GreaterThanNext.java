public class GreaterThanNext {
    public static void main(String[] args) {
        int[] a = {11, 21, 31, 5, 7, 9};
        for (int i = 0; i < a.length-1; i++) {

                if(a[i+1]<a[i]) {

                    System.out.println("element is "+ a[i+1]);
                    System.out.println("the difference is " + (a[i] - a[i+1]));
                }

        }
    }
}
