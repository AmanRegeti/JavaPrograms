public class AddSmallerElements {
    public static void main(String[] args) {
        int[] a = {11, 5, 13, 7, 9, 15};
        findLower(a);
    }

    private static void findLower(int[] a) {

        int endingSum= 0;
        for (int i = 0; i < a.length; i++) {
            int e1 = a[i];
            int sum = sumOfSmallerElements(e1, a);
            int finalSum = finalSum(e1, sum);
            System.out.println(finalSum);
            endingSum= finalSum(finalSum,endingSum);
        }
        System.out.println("Ending Sum: " +endingSum);
    }

    public static int sumOfSmallerElements(int e1, int[] a) {
        int sum = 0;
        for (int j = 0; j < a.length; j++) {
            int e2 = a[j];
            boolean isLower = checkIfLower(e1, e2);
            if (isLower) {
                sum += e2;
            }
        }
        return sum;
    }

    private static boolean checkIfLower(int e1, int e2) {
        if (e2 < e1) {
            return true;
        }

        return false;
    }

    private static int finalSum(int e1, int sum) {
        int finalSum = e1 + sum;
        return finalSum;
    }

}
