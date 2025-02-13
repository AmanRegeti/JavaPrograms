import java.util.Arrays;

public class movingZeroToRight {
    public static void main(String[] args) {
        int[] a = {0, 11, 0, 12, 0, 0, 13};
        //move(a);
        move2(a);
    }

    private static void move(int[] a) {
        int[] temp = new int[a.length];

        for (int i = 0,j=0; i<a.length ; i++) {
            int eA1 = a[i];
            if (eA1 != 0 ) {
                temp[j] = eA1;
                j++;
            }
        }
        a = temp;
        System.out.println(Arrays.toString(a));
    }
    //swap logic
    private static void move2(int[] a) {
        int count = 0;
        for (int i = 0; i<a.length ; i++) {
            int eA1 = a[i];
            if (eA1 != 0 ) {
                a[count] = eA1;
                count++;
            }
        }
        for (int j=count;j<a.length; j++){
            a[j]= 0;
        }

        System.out.println(Arrays.toString(a));
    }
    private static void swap(int[] a,int e1,int e2){
        int temp = e1;
        e1=e2;
        e2= temp;
    }
}
