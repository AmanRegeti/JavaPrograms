public class StringStartsWith {
    public static void main(String[] args) {
        String name = "Aman Regeti";
        String prefix = "Aman";
        char[] chars = name.toCharArray();
        char[] prefixArray = prefix.toCharArray();
        checking(prefixArray, chars);
    }

    // todo: time complexity
    private static void checking(char[] prefix, char[] chars) {
        int count = 0;
        for (int i = 0; i < prefix.length; i++) {
            char p1= prefix[i];
            char c1 = chars[i];
            boolean isPrefix = isPrefix(p1, c1);
            if (isPrefix) {
                count++;
            }
            else{
                break;
            }

        }
        if (count == prefix.length) {
            System.out.println("Prefix");
        } else {
            System.out.println("Not Prefix");
            System.out.println(count);
        }
    }

    private static boolean isPrefix(char p1, char c1) {
        if (c1 == p1) {
            return true;
        }
        return false;
    }
}