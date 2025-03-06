public class SumOfSmaller {
    public static void main(String[] args) {
        int[] a = {11, 2, 5, 7, 9, 15};
        CheckingSmaller(a);
    }

    private static void CheckingSmaller(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            int a1 = a[i];
            for (int j = 0; j < a.length; j++) {
                boolean check = false;
                int a2 = a[j];

                if (a2 < a1) {
                    sum= AddingSmaller(a1,a2);
                    for (int k = 0; k < a.length; k++) {
                        int a3 = a[k];
                        if (sum>a[k]){
                            int Fsum=AddingSmaller(sum,a3) ;
                            System.out.println(Fsum);
                            break;
                        }
                    }
                    break;
                }
                if (j==a.length-1){
                    System.out.println("not found");
                    }
                }

            }
        }

        private static int AddingSmaller ( int a1, int a2){
            int sum = a1 + a2;

            return sum;
        }

    }
