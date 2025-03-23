public class PatternPractice {
    public static void main(String[] args) {
        int n = 3;
        //StarRows(n);
        System.out.println("-----------------------------------");
        StarTriangle(n);
    }

   /* private static void StarRows(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
    }
*/
    private static void StarTriangle(int n) {
        int k = n + 1;
        //System.out.println("*");
        for (int i = -1; i < n; i += 2) {
            k--;
            for (int j = 0; j < n - k; j+=2) {
                System.out.print(' ');
            }

            for (int j = n; j >= i; j--) {
                System.out.print("* ");

            }
            for (int j = 0; j < n - k; j+=2) {
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
