public class FillInMissingNumber {
    public static void main(String[] args) {
        int[] a ={2,3,6,8,9};
        FindMissingNumber(a);
        System.out.println("------------");
        FindMissingNumber2(a);
    }
    private static void FindMissingNumber (int[] a){
        for (int i= a[0]+1,j=1; i<a[a.length-1]; i++){
            if (i<a[j]){
                System.out.println(i);
            } else {
                j++;
            }

        }
    }
    private static void FindMissingNumber2(int[] a) {

        for (int i = 0; i < a.length-1; i++) {
            int e1= a[i];
            int e2 = a[i+1];
            for (int j = e1+1; j <= e2-1 ; j++) {
                System.out.println(j);
            }

        }
    }

}
