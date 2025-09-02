import java.util.Arrays;

public class Find6 {
    public static void main(String[] args) {
        int[] a = { 7, 2,6, 3,};
        int sum = 0;
//        try {
//            Finding6(a);
//        } catch (No6Exception e) {
//            System.out.println("There was no 6 in this Array");
//            return;
//        } catch (StartingOrEnding6 f) {
//
//        }

            int[] answer =Finding6(a);

        System.out.println(Arrays.toString(answer));

    }


    private static int[] Finding6(int[] a){
        for (int i = 0; i < a.length; i++) {
        if(a[i]==6){
            if (i==a.length-1||i==0){
                int[] remaining = new int[a.length-1];
                for (int j = 0,k=0; j < a.length; j++ ) {
                    if (a[j]!=6){
                        remaining[k] = a[j];
                        k++;
                    }
            }
                return remaining;
            }
            else {
                int sum =equals(a,i);
                int[] answer={sum};
                return answer;
            }

            }

        }
        return a;
    }

    private static int equals(int[] a, int i) {
        int sum = 0;
        sum = a[i + 1] + a[0];
        return sum;
    }
}

