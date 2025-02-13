import java.util.Arrays;

public class StringOfVowels {
    public static void main(String[] args) {
        String name = "Aman Regeti";
        char[] chars = name.toCharArray();
        {
            int count = findVowels(chars);
            System.out.println(count);

            makeStringOfVowels(chars, count);
        }
        System.out.println("---------------");
        {
            char[] trimmedTempArray = trimTempArray(chars);
            System.out.println(stringOfVowels(trimmedTempArray));
        }

    }

    public static boolean isVowel(char e1) {
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

    private static void makeStringOfVowels(char[] chars, int count) {

        char[] temp = new char[chars.length];

        for (int i = 0, j = 0; i < chars.length; i++) {
            char e1 = chars[i];
            boolean isVowel = isVowel(e1);
            if (isVowel) {
                temp[j] = e1;
                j++;
            }
        }

        System.out.println(Arrays.toString(temp));

    }


    private static char[] trimTempArray(char[] chars) {
        char[] temp = new char[chars.length];
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            char e1 = chars[i];
            boolean isVowel = isVowel(e1);
            if (isVowel) {
                temp[j] = e1;
                j++;
            }
        }
        char[] trimmed = trim(temp,j);
        return trimmed;
    }

    private static char[] trim(char[] temp, int count) {

        char[] trimmed = new char[count];
        for (int i = 0; i < count; i++) {
            char e1 = temp[i];
            trimmed[i] = e1;
        }
        return trimmed;
    }
    private static String stringOfVowels(char[] trimmed){
        String vowels = "";
        for (int i = 0; i < trimmed.length; i++) {
            vowels += trimmed[i];
        }
        return vowels;
    }
}


