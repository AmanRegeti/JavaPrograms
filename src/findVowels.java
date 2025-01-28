public class findVowels {
    public static void main(String[] args) {
        String name = "Aman Regeti";

        char[] chars = name.toCharArray();
        int count = findVowels(chars);
        System.out.println("There are " + count + " vowels");
        int consonats= findNonVowels(chars);
        System.out.println(consonats);
    }


    private static int findVowels(char[] chars) {
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            char e1 = chars[i];
            if (e1 == 'a' || e1 == 'e' || e1 == 'i' || e1 == 'o' || e1 == 'u' ||
                    e1 == 'A' || e1 == 'E' || e1 == 'I' || e1 == 'O' || e1 == 'U') {
                count++;
            }
        }
        return count;
    }

    private static int findNonVowels(char[] chars) {
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            char e1 = chars[i];
            if (!(e1 == 'a' || e1 == 'e' || e1 == 'i' || e1 == 'o' || e1 == 'u' ||
                    e1 == 'A' || e1 == 'E' || e1 == 'I' || e1 == 'O' || e1 == 'U')) {
                count++;
            }
        }
        return count;
    }
}
