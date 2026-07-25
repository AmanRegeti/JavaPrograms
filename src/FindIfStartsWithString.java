import java.util.HashMap;
import java.util.Map;

public class FindIfStartsWithString {
    public static void main(String[] args) {
        String a = "mana";
        String b = "mama";
  //      try {
            boolean sameOrNot = checkIfSame2(a.toCharArray(), b.toCharArray());
            System.out.println(sameOrNot);
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Your Index is Out of Bounds");;
//        }

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
//    private static char[] addString(int index, char[] text, char[] subtext){
//        int pos;
//        char[] added= new char[index+text.length];
//        for (pos = 0; pos < index; pos++) {
//            added[pos]=text[pos];
//        }
//        for (int i=0; i < subtext.length; i++, pos++) {
//            added[pos] = subtext[i];
//        }
//        for (int i= index; i < text.length; i++, pos++) {
//            added[pos] = text[i];
//        }
//
////      added=arrayInsert(subtext,pos,added,0);
////       added=arrayInsert(text,pos,added,index);
//        return added;
//    }
//    private static char[] arrayInsert(char[] charArray, int pos, char[] added, int i ){
//        for (; i < charArray.length; i++, pos++) {
//            added[pos] = charArray[i];
//        }
//        return added;
//    }
private static char[] arrayInsert(int index, char[] text, char[] subtext) throws IndexOutOfBoundsException {
        if (index > text.length){
            throw new IndexOutOfBoundsException("Index out of Bounds");
        }
        int pos=0;
        char[] added= new char[text.length+subtext.length];
        for (int i = 0; i < text.length;i++) {
            if (i == index) {
                pos = insert(subtext, pos, added);
                //i--;
            }
            added[pos] = text[i];
            pos++;
        }
        return added;
    }
    private static int insert(char[] subtext, int pos, char[] added){
        for (int j = 0; j < subtext.length;j++,pos++) {
            added[pos]=subtext[j];
        }
        return pos;
    }
    private static boolean checkIfSame1(char[] a, char[] b){
        if (a.length != b.length) {
            return false;
        }
        int[] freq = new int[26];

        for (int i = 0; i < a.length; i++) {
            freq[a[i] - 'a']++;
        }

        for (int i = 0; i < b.length; i++) {
            freq[b[i] - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }
    private static boolean checkIfSame(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            int countA=0;
            int countB=0;
            int ch=a[i];
            for (int j = 0; j < a.length; j++) {
               if (ch==a[j]){
               countA++;
               }
            }
            for (int j = 0; j < b.length; j++) {
                if (ch==b[j]){
                    countB++;
                }
            }
            if (countA != countB){
                return false;
            }
        }
        return true;

    }
    private static boolean checkIfSame2(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
    }
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            char ch= a[i];
            if (map.containsKey(ch)) {
                int chfreq = map.get(ch);
                map.put(ch, chfreq + 1);
            } else{
                map.put(ch,1);
            }
        }
        for (int i = 0; i < b.length; i++) {
            char ch= b[i];
           // System.out.println(ch);
            int chfreq = map.get(ch);
            map.put(ch,chfreq-1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (value> 0){
                return false;
            }
        }
        return true;
    }
}
