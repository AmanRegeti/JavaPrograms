public class PatternPractice {
    public static void main(String[] args) {
        int n = 5;
        StarRows(n);
        System.out.println("-----------------------------------");
        StarTriangle(n);
    }

    private static void StarRows(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print("*");

            }
            System.out.println("*");

        }
    }

    private static void StarTriangle(int n) {
        //System.out.println("*");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j);

            }
            System.out.println();

        }
    }
}
