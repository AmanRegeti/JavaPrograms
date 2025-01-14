// find the numbers which are bigger than its neighbors
public class findBiggerThanNeighbors {
    public static void main(String[] args) {
        int[] a = {11,9,15,7,6,12,10};
        biggerThanNeighbors(a);
    }
    private static void biggerThanNeighbors(int[] a){
        for ( int i =1; i<a.length-1;i++){
            int e1= a[i];
            int next= a[i+1];
            int previous=a[i-1];
            if (e1>next && e1>previous){
                System.out.println(e1);
            }
        }
    }
}
