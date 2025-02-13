import java.util.Arrays;

public class FindingMultiples {
    public static void main(String[] args) {
        int[] a = {1, 3, 12, 13, 6, 24, 15, 16, 13};
        int maxresultsize = (a.length * a.length) - a.length;
        int[] result = new int[maxresultsize];
        int counter = -1;

        for (int i = 0; i < a.length; i++) {
            int element = a[i];

            for (int j = 0; j < a.length; j++) {

                if (j != i) {
                    if (a[j] % element == 0) {
                        //System.out.println("     " + a[j] + " can be divided by " + element);
                        counter++;
                        int matchedElement = a[j];
                        //int[] result = new int [10];
                        result[counter] = matchedElement;
                    }

                }


            }
        }
        /*if (counter >= 0) {
            //result = new int [counter];
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("no multiples");
        }*/
        for (int k=0;k<counter-1;k++){
            System.out.print(result[k]+",");
        }
        System.out.println();
    }
}


