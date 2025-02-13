public class minandmax {
    public static void main(String[] args) {
        int[] a = {89, 34, 23, 67, 45, 33, 21, 75, 42, 91};
        int hv =a[0];
        int lv =a[0];

        for (int i=1; i<a.length; i++  ){
            if (a[i]> hv){
                hv= a[i];
            //Test comment
            }

        }
        System.out.println("The highest value is " + hv);
        System.out.println("and");

        for (int j=1; j<a.length; j++){
            if (a[j]< lv){
                lv= a[j];

            }
        }
        System.out.println("The lowest value is " + lv);
    }
}