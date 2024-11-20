public class SearchAnElement {
    public static void main(String[] args) {
        int[] a = {11,34,23,67,45,33,21};
        System.out.println(" Enter a number");
        int v = 33;

        for (int i=0; i< a.length;i++ )
        {
            if(a[i]==v)
            {
                System.out.println("yes");
                System.out.println("Position is " + (i+1));
                //break;
            }
            if(a[i]!=v)
            {
                System.out.println("No");
                //System.out.println("Position is " + (i+1));
                break;
            }

        }
    }
}
