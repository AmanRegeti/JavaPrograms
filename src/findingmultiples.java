public class findingmultiples {
    public static void main(String[] args) {
        int[] a = {1, 3,12, 13, 6, 24, 15, 16, 13};
        for(int i=0; i< a.length; i++){
            System.out.println("--------------------");
            System.out.println( "checking for "+a[i]);
            for (int j=0; j<a.length;j++){
                //System.out.println(a[i]);
                if (j!=i){
                if (a[j] % a[i]==0){
                    System.out.println("     "+a[j]+" can be divided by " + a[i]);
                    }
                }
            }
        }
    }
}
