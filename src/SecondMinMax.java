public class SecondMinMax {
    public static void main(String[] args) {
        int[] a = {89, 34, 23, 67, 45, 33, 21, 75, 42, 91};
//pass by value never changes the original input instead creates a copy
        //pass by reference always changes the original array and it passes
        // impure function does not manipulate input parameters
        int[] hvLv = findHvLv(a);
        int[] secocndhvandlv= findSecondHvLv(a, hvLv);

        int hv = hvLv[0];
        int lv = hvLv[1];

        int secondhv=secocndhvandlv[0];
        int secondlv = secocndhvandlv[1];

        System.out.println("The highest value is "+hv);
        System.out.println("The lowest value is "+lv);

        System.out.println("The second highest value is " + secondhv);
        System.out.println("The second lowest value is " + secondlv);
    }

    private static int[] findHvLv(int[] a){
        int hv = a[0];
        int lv = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > hv) {
                hv = a[i];
            }
            if (a[i] < lv) {
                lv = a[i];
            }
        }
        int[] Hvandlv = {hv,lv};
        return Hvandlv;
    }

    private static int[] findSecondHvLv(int[] a, int[] HvandLv) {
        int secondhv = a[0];
        int secondlv = a[0];
        int hv = HvandLv[0];
        int lv = HvandLv[1];
        for (int j = 1; j < a.length; j++) {
            int element = a[j];
            if (element > secondhv && element != hv) {
                secondhv = a[j];
            }
            if (element < secondlv && element != lv) {
                secondlv = a[j];
            }
        }
        int[] SecondHvandLv = {secondhv, secondlv};
        return SecondHvandLv;
    }
}


