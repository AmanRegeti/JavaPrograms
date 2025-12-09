public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] a = {10,13,14,16,21,24,25};//2,4,5,6,8
        iteratingThroughtheArray(a);
    }

    private static void iteratingThroughtheArray(int[] a) {
        for (int i = 0,j=a.length-1; i <= j; i++,j--) {
            if (i==j){
                System.out.println(a[i]);
                return;
            }
                PrintingBetweenNumbers(a[i],a[j],a);
            System.out.println("----------------------------------");
        }
    }

    private static boolean ifContains(int[] a, int e1) {

        for (int i = 0; i < a.length; i++) {
            if (e1==a[i]){
                return true;
            }

        }
        return false;
    }
    private static void PrintingBetweenNumbers(int start,int end,int[] a){
        for (int i = start; i < end; i++) {
            if (!ifContains(a,i))
            System.out.println(i);
        }
    }
}