public class SecondMinMax {
    public static void main(String[] args) {
        int[] a = {89, 34, 23, 67, 45, 33, 21, 75, 42, 91};
//pass by value never changes the original input instead creates a copy
        //pass by reference always changes the original array and it passes
        // impure function does not manipulate input parameters
        MinMaxResult minmaxResult = findHvLv(a);


        {
            int hv = minmaxResult.max;
            int lv = minmaxResult.min;

            SecondMinMaxResult result = new SecondMinMaxResult();
            int secondhv = result.secondmax;
            int secondlv = result.secondmin;

            System.out.println("The highest value is " + hv);
            System.out.println("The lowest value is " + lv);

            System.out.println("The second highest value is " + secondhv);
            System.out.println("The second lowest value is " + secondlv);
        }

        System.out.println("------------------------------");
        {
            BothMinMax bothMinMax= findSecondHvLv(a);
            int hv= bothMinMax.minMaxResult.max;
            int lv= bothMinMax.minMaxResult.min;
            int secondlv = bothMinMax.secondMinMaxResult.secondmin;
            int secondhv = bothMinMax.secondMinMaxResult.secondmax;
            System.out.println("The highest value is " + hv);
            System.out.println("The lowest value is " + lv);

            System.out.println("The second highest value is " + secondhv);
            System.out.println("The second lowest value is " + secondlv);
        }
    }

    private static MinMaxResult findHvLv(int[] a){
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
        MinMaxResult result = new MinMaxResult();
        result.min = lv;
        result.max = hv;
        return result;
    }

    private static BothMinMax findSecondHvLv(int[] a) {
        int secondhv = a[0];
        int secondlv = a[0];
        MinMaxResult minmaxResult = findHvLv(a);


        int hv =minmaxResult.max ;
        int lv =minmaxResult.min ;
        for (int j = 1; j < a.length; j++) {
            int element = a[j];
            if (element > secondhv && element != hv) {
                secondhv = a[j];
            }
            if (element < secondlv && element != lv) {
                secondlv = a[j];
            }
        }

        SecondMinMaxResult secondMinMaxResult = new SecondMinMaxResult();
        secondMinMaxResult.secondmin = secondlv;
        secondMinMaxResult.secondmax = secondhv;
        BothMinMax result = new BothMinMax();
        result.minMaxResult = minmaxResult;
        result.secondMinMaxResult= secondMinMaxResult;
        return result;



    }


}


