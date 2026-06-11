public class FindIfStartsWithString {
    public static void main(String[] args) {
        String subtext = "n R";
        String txt = "Aman Regeti";
        Boolean isthere = subString(subtext.toCharArray(), txt.toCharArray());
        System.out.println(isthere);
//        Boolean isStart = endsWith(suffix.toCharArray(), txt.toCharArray());
//        System.out.println(isStart);
    }
    private  static boolean startsWith(String prefix, String text) {
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
    private  static boolean startsWith2(char[] prefix, char[] text) {
        Boolean isStart= true;
        if (prefix.length > text.length) {
            isStart = false;
        } else {
            for (int i = 0; i < prefix.length; i++) {
                if (text[i] != prefix[i]) {
                    isStart = false;
                    break;
                }
            }
        }
        return isStart;
    }
    private  static boolean endsWith(char[] suffix, char[] text) {
        Boolean isStart= true;
        if (suffix.length > text.length) {
            isStart = false;
        } else {
            for (int i = suffix.length-1, j= text.length-1 ; i > 0; i-- ,j--) {
                if (text[j] != suffix[i]) {
                    isStart = false;
                    break;
                }
            }
        }
        return isStart;
    }
    public static boolean subString(char[] subtext, char[] text) {
        char firstChar = subtext[0];
        boolean match = false;
        for (int i = 0; i < text.length; i++) {
            if (text[i] == firstChar) {
                match = subStringWhole(subtext, text, i);
                if (match) {
                    return match;
                }
            }
        }

        return match;
    }
    private static boolean subStringWhole(char[] subtext, char[] text, int i){
        boolean match = true;
        if (text.length-(i)<subtext.length){
            return false;
        }
        for (int j = 0; j < subtext.length-i; j++) {
            if (text[i + j] != subtext[j]) {
                match = false;
                break;
            }
        }
        return match;
    }
}
