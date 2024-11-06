public class StringPractice {
    public static void main(String[] args) {
        String s1 = "aman";
        String s2 = "aman";
        boolean result = s1 == s2;        // == checks memory locations
        boolean result2 = s1.equals(s2) ; // checks values
        String s3 = new String("aman"); // new operator forces java to use different memory location
        boolean result3 = s1 == s3;
        boolean result4 = s1.equals("aman");
        System.out.println(result);// true
        System.out.println(result2);// true
        System.out.println(result3);// false
        System.out.println(result4);//true
    }
}
