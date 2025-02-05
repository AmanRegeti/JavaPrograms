public class averageFinding {
    public static void main(String[] args) {
        int[] data = {41, 42, 5, 2, 4, 56, 83};
        int sum=0;
        for (int i = 0; i < data.length; i++) {
           sum += data[i];
        }
        int average =sum/data.length;
        System.out.println(sum);
        System.out.println(average);
    }
}
