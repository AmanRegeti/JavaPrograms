public class FillInMissingNumber {
    public static void main(String[] args) {
        int[] a ={2,3,6,8,9};
        FindMissingNumber(a);
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
}
