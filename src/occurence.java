public class occurence {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 2,3 };
        int target=3;
        int count=0;
        for (int i =0; i< a.length; i++){
            if (a[i] == target){
                count++;

            }
        }
        System.out.println(target + " occurs " +count + " times ");

    }
}
