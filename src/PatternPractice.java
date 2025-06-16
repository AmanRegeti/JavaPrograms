public class PatternPractice {
    public static void main(String[] args) {
        int n = 3;
        //StarRows(n);
        System.out.println("-----------------------------------");
        //StarTriangle(n);
        NumberTriangle(n);
        LetterTriangle(n);
        LetterTriangle2(n);
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
        ;
        int o = n;
        for (int i = 0; i < n; i++, o--) {
            System.out.println(" ");
            int k = 0;
            int l = 0;
            for (int j = 0; l < n - o; l++) {
                System.out.print(" ");
            }
            for (int j = 0; k < n - i; k++) {
                System.out.print("* ");
            }
        }

    }

    private static void ZeroOneTriangle(int n) {
        int l = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++, l++) {
                int k = l % 2;
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    private static void NumberTriangle(int n) {
        int l = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++, l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
    private static void LetterTriangle(int n) {

        char[] Alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(Alphabet[j]);
            }
            System.out.println();
        }
    }
    private static void LetterTriangle2(int n) {

        char[] Alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(Alphabet[i]);
            }
            System.out.println();
        }
    }

}