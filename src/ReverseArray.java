import java.util.Arrays;
//why would the swap not work
public class ReverseArray {
    public static void main(String[] args) {
        int[] a = { 11,25,35,5,7,9};
        reverse(a);
        System.out.println(Arrays.toString(a));

    }
    // make this work
    private static void reverse(int[] a){


        for(int i=a.length-1,j=0; j<i ; j++, i--){

            System.out.println(a[i] +"," +a[j]);
          //swap(a[i], a[j]);
            swap(a, i, j);
            System.out.println(a[i] +"," + a[j]);

      }
    }
    private static void swap(int[] a,int i,int j){
      int temp = a[j];
      a[j]=a[i];
      a[i]= temp;
    }
    // Why would this not work?
    //n1 and n2 are pass by value It only changes the values in the memory and not the original array
    private static void swap(int n1, int n2) {
        //System.out.println(n1 +"," +n2);
        int temp = n1;
        n1=n2;
        n2=temp;
        //because after half it will reset the array
        //System.out.println(n1 +"," +n2);
    }
}
