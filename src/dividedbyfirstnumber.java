public class dividedbyfirstnumber {
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 13, 12, 24, 15, 16, 13};

        //Method 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
                for (int j = i + 1; j < a.length; j++) {
                    boolean canbedivded = a[j] % a[i] == 0;
                    if (canbedivded) {
                        System.out.println(a[j] + " can be divided by " + a[i]);
                    }
                }
                break;
            }

        }
        System.out.println("---------------------------------------------------------------------------------------");

        //Method 2;
        //int[] a = {1, 3,6, 13, 12, 24, 15, 16, 13};
        {
            int i;
            for (i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0) {
                    //    System.out.println(a[i]);

                    break;
                }
            }
            int element = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] % element == 0) {
                    System.out.println(a[j] + " can be divided by " + element);
                }

            }
        }
        System.out.println("-----------------------------------");
        {

            int i;
            int element=0;
            for (i=0; i < a.length; i++) {
                if (a[i] % 2 == 0) {
                    //    System.out.println(a[i]);
                    element = a[i];
                    break;
                }
            }

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] % element == 0) {
                    System.out.println(a[j] + " can be divided by " + element);
                }

            }



        }

        System.out.println("-----------------------------------");
        {

            for (int i=0; i < a.length; i++) {
                int element = a[i];
                if (element % 2 == 0) {
                    //    System.out.println(element);

                    for (int j = i + 1; j < a.length; j++) {
                        if (a[j] % element == 0) {
                            System.out.println(a[j] + " can be divided by " + element);
                        }

                    }
                    break;
                }

            }





        }


    }
}