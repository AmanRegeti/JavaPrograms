public class PatternPractice {
    public static void main(String[] args) {
        int n = 6;
        pattern8();
        System.out.println("-----------------------------------");
        StarRows(n);
        System.out.println("-----------------------------------");
        StarTriangle(n);
        System.out.println("----------------------");
        NumberTriangle(n);
        System.out.println("----------------------");
        LetterTriangle(n);
        System.out.println("----------------------");
        LetterTriangle2(n);
        System.out.println("----------------------");
        UpsideDownLetterTriangle(n);
    }

    private static void StarRows(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
    }

    private static void StarTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.println(" ");
            }
            System.out.println();
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

        char[] Alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(Alphabet[j]);
            }
            System.out.println();
        }
    }

    private static void LetterTriangle2(int n) {

        char[] Alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(Alphabet[i]);
            }
            System.out.println();
        }
    }
    private static void UpsideDownLetterTriangle(int n) {
        char[] Alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i = 0; i < n; i++)
        {
        int k=i;
            for (int j=0;0 <n-k; j++,k++)
            {
                System.out.print(Alphabet[j]);
            }
            System.out.println();

            }
        }
        public static void pattern8() {
            int k;
            int n =4;
            for(int i= n; i>0;i--){
                for( k=0;k<n-i;k++){
                    System.out.print(" ");
                }
                for(int j=1; j< n-k;j++){
                    System.out.print("*");
                }
                for(int j=0; j< n-k;j++){
                    System.out.print("*");
                }
                for( k=0;k<n-i;k++){
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }

    }