public class ArrayLoop {
    public static void main(String[] args) {
        int[] a = {11,34,23,67,45,33,21};

        for(int i =0; i < a.length; i++) {
            int element = a[i];
            System.out.println(element);
        }
        System.out.println("-----------------");

        for (int i=0; i < a.length; i+=2)  {
            int element = a[i];
            System.out.println(element);
        }
    }
}
