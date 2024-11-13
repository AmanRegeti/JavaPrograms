public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = {11, 34, 23, 67, 90};

        int[] array2 = new int[5];
        array2[0] = 11;
        array2[1] = 34;
        array2[2] = 23;
        array2[3] = 67;
        array2[4] = 90;

        int element = array[3];
        System.out.println("element: "+element); // 67

        int sum = array[3] + array[1];

        int e1 = array[1];
        int e2 = array[3];
        int sum2 = e1+ e2;

     }
}
