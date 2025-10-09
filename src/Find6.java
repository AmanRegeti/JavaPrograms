import java.util.Scanner;

public class Find6 {
    public static void main(String[] args) throws No6Exception {
        int[] a = {1,2,3,4,5,6};
        System.out.println("What number should I find");
        //try {
         Scanner scanner= new Scanner(System.in);
         int number = scanner.nextInt();
            final int index = finding6(a,number);
            takeSum(a, index);
// int sum= sum(a,index);
// System.out.println(sum);
// } catch (No6Exception e) {
// System.out.println(e);
// }


    }


    private static int finding6(int[] a, int number) throws No6Exception {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == number) {
                return i;
            }
        }

        throw new No6Exception("There is no "+number+" in this exception");

    }

    private static void takeSum(int[] a, int i) {
        int indexOf6 = i;
        int indexOfAfter6 = i + 1;
        int indexOfStart = 0;
        while (indexOfStart < indexOf6 && indexOfAfter6 < a.length) {
            int sum = a[indexOfStart] + a[indexOfAfter6];
            indexOfStart++;
            indexOfAfter6++;
            System.out.println(sum);
        }
        printRemaining(a, indexOfAfter6, indexOfStart, i);

    }

    private static void printRemaining(int[] a, int indexOfAfter6, int indexOfStart, int i) {




        printLeft(indexOfStart,i,a);
        printRight(indexOfAfter6,a);


    }
    private static void printLeft(int indexOfStart, int i,int[] a) {
        for (int j = indexOfStart ; j < i; j++) {
            System.out.println(a[j]);
        }
    }

    private static void printRight(int indexOfAfter6,int[] a) {
        for (int j = indexOfAfter6; j < a.length; j++) {
            System.out.println(a[j]);
        }
    }




//    (private static int[] Finding6(int[] a) throws Yes6Exception {
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 6) {
//                if (i == a.length - 1 || i == 0) {
//                    int[] remaining = new int[a.length - 1];
//                    for (int j = 0, k = 0; j < a.length; j++) {
//                        if (a[j] != 6) {
//                            remaining[k] = a[j];
//                            k++;
//                        }
//                    }
//                    return remaining;
//                } else {
//                    try {
//                        throw new Yes6Exception("There is a 6 in this Code");
//                    } catch (Yes6Exception e) {
//                        throw e;
//                    }
//                }
//
//            }
//
//        }
//        return a;
//    }

   /* private static int sum(int[] a, int i) {
        int sum = 0;
        sum = a[i + 1] + a[0];
        return sum;
    }*/
}

