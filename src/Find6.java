public class Find6 {
    public static void main(String[] args) {
        int[] a = {1, 5, 7, 8, 2, 3, 5,6};
        try {
           int sum= Find6(a);
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("There was no 6 in this Array or was at the starting or end");
        }
    }

    private static int Find6(int[] a) throws No6Exception,StartingOrEnding6{
        for (int i = 0; i < a.length; i++) {
            if (a[0] == 6 || a[a.length - 1] == 6) {
                try{
                    throw new StartingOrEnding6("There was no 6 in this Array");
                }catch (StartingOrEnding6 f){
                    throw f;
                }
            }else if (a[i] == 6) {
                int sum = equals(a, i);
                return sum;try {
                    throw new No6Exception("There was no 6 in this Array");
                }catch (No6Exception e){
                    throw e;
                }
            }
    }

    private static int equals(int[] a,int i) {
        int sum=0;
        sum=a[i+1]+a[0];
        return sum;
    }
}
