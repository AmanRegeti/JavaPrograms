import java.util.Arrays;

public class stringOfVowels {
    public static void main(String[] args) {
        String name = "Aman Regeti";
        char[] chars = name.toCharArray();

        /*int count = findVowels(chars);
        System.out.println(count);
*/
        makeStringOfVowels(chars);

    }
    public static boolean isVowel (char e1) {
        if (e1 == 'a' || e1 == 'e' || e1 == 'i' || e1 == 'o' || e1 == 'u' ||
                e1 == 'A' || e1 == 'E' || e1 == 'I' || e1 == 'O' || e1 == 'U') {
            return true;
        }
        return false;
    }
    private static int findVowels(char[] chars) {
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            char e1 = chars[i];
            boolean isVowel = isVowel(e1);
            if (isVowel) {
                count++;
            }
        }
        return count;
    }
    private static void makeStringOfVowels(char[] chars) {

        char[] temp = new char[chars.length];

        for (int i = 0, j=0; i < chars.length; i++) {
            char e1 = chars[i];
            boolean isVowel= isVowel(e1);
            if (isVowel) {
              temp[j] = e1;
              j++;
            }
        }

        System.out.println(Arrays.toString(temp));
        char[] trimmedArray = trimTempArray(temp, );
        String strOfVowels = new String(trimmedArray);
        System.out.println(strOfVowels);
    }


    private static void trimTempArray(char[] temp,int count) {


    }
}


