public class SecondMinMax {
    public static void main(String[] args) {
        int[] a = {89, 34, 23, 67, 45, 33, 21, 75, 42, 91};
        int hv = a[0];
        int lv = a[0];
        int hvIndex = 0;
        int lvIndex = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > hv) {
                hv = a[i];
                hvIndex = i;
            }
            if (a[i] < lv) {
                lv = a[i];
                lvIndex = i;
            }
        }
        System.out.println("The highest value is "+hv);
        System.out.println("The lowest value is "+lv);
        int secondhv = a[0];
        int secondlv = a[0];

        //int[] a = { 34,91, 23,89, 67, 45};

        for (int j = 1; j < a.length; j++) {
            if (a[j] > secondhv ) {
                if (a[j] != hv )
                secondhv = a[j];

            }
            if (a[j] <secondlv ) {
                if (a[j] != lv)
                    secondlv = a[j];
            }
            }
        System.out.println("The second highest value is " + secondhv);
        System.out.println("The second lowest value is " + secondlv);
        }

    }


