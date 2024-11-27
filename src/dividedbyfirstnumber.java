public class dividedbyfirstnumber {
    public static void main(String[] args) {
        int[] a={1,3,6,13,12,24,15,16,13};

        for (int i = 0; i<a.length; i++){
            if (a[i]% 2==0){
                System.out.println(a[i]);
                for (int j=i+1; j<a.length; j++){
                    boolean canbedivded = a[j] % a[i]==0;
                    if (canbedivded){
                        System.out.println(a[j] + "can be divided by" + a[i]);


                    }

                }
                break;
            }

        }
    }
}
