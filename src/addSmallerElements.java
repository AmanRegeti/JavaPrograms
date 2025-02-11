public class addSmallerElements {
    public static void main(String[] args) {
        int[] a = {11,5,13,7,9,15};

    }

    private static void findLower(int[] a) {
        for (int i = 0; i < a.length ; i++) {
            int e1= a[i];
            int sum = sumOfSmallerElements(e1, a);
            int finalSum = finalSum(e1, sum);
            System.out.println(finalSum);
        }
    }

    public static int  sumOfSmallerElements(int e1, int[] a) {
        int sum=0;
        for (int j = 0; j < a.length; j++) {
            boolean isLower=checkIfLower();
           if(isLower) {
              sum+=a[j];
           }
        }
        return sum;
    }
    private static boolean checkIfLower() {
if()
        return false;
    }

}
