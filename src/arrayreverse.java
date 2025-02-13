import java.util.Arrays;

public class arrayreverse {
    public static void main(String[] args) {
        int[] b =new int[6];
        int[] a = {1, 4, 3, 2, 6, 5};
        int j =0;
        for (int i=(a.length)-1; i>=0; i--)
        {
            b[j] = a[i];
            //System.out.println(b[j]);
            j++;

        }

        System.out.println(Arrays.toString(b));
    }
}
