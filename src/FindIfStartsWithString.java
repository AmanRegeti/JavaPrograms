import java.sql.SQLOutput;

public class FindIfStartsWithString {
    public static void main(String[] args) {
        String prefix = "Aman";
        String txt = "Aman Regeti";
        Boolean isStart = StartsWith(prefix, txt);
        System.out.println(isStart);
    }
    private  static boolean StartsWith(String prefix, String text) {
        Boolean isStart= true;
        if (prefix.length() > text.length()) {
            isStart = false;
        } else {
            for (int i = 0; i < prefix.length(); i++) {
                if (text.charAt(i) != prefix.charAt(i)) {
                    isStart = false;
                    break;
                }
            }
        }
        return isStart;
    }
}
