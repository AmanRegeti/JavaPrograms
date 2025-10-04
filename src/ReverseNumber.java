public class ReverseNumber {
    public static void main(String[] args) {
       // long a = 948570394813894193L;
        int a = 123;
        long i=1L;
        int digits=0;
        while (a/i > 1) {
            digits++;
            i = i * 10;
        }
        System.out.println(digits);
        for (int j=0; j < digits; j++){
            
        }
    }
}
